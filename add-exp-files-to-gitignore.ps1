# Найти корень репозитория (где находится .git)
$repoRoot = git rev-parse --show-toplevel
if (-not $repoRoot) {
    Write-Host "Error: Not a Git repository!" -ForegroundColor Red
    exit 1
}

# Перейти в корень репозитория
Set-Location -Path $repoRoot

# Поиск файлов с целевой строкой
$targetFiles = Get-ChildItem -Recurse -File | Where-Object {
    $_ | Select-String -Pattern "// You can experiment here, it won’t be checked" -Quiet
}

if (-not $targetFiles) {
    Write-Host "No files found with the target comment." -ForegroundColor Yellow
    exit 0
}

# Получить текущее содержимое .gitignore
$gitignorePath = Join-Path -Path $repoRoot -ChildPath ".gitignore"
$existingIgnores = @()
if (Test-Path $gitignorePath) {
    $existingIgnores = Get-Content -Path $gitignorePath
}

# Добавить новые файлы в .gitignore
$addedCount = 0
foreach ($file in $targetFiles) {
    # Получить относительный путь в формате для Git
    $relativePath = $file.FullName.Substring($repoRoot.Length + 1).Replace("\", "/")

    # Проверить, не добавлен ли уже файл
    if ($existingIgnores -contains $relativePath) {
        Write-Host "Already ignored: $relativePath" -ForegroundColor Gray
        continue
    }

    # Добавить в .gitignore
    Add-Content -Path $gitignorePath -Value $relativePath
    $addedCount++
    Write-Host "Added to .gitignore: $relativePath" -ForegroundColor Green
}

# Итоговый отчет
Write-Host "`nOperation complete!" -ForegroundColor Cyan
Write-Host "Scanned files: $($targetFiles.Count)"
Write-Host "Newly ignored: $addedCount"