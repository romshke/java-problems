Get-ChildItem -Recurse -Include *.java | ForEach-Object {
    $content = Get-Content $_.FullName -Raw
    
    $hasImport = $content -match "import java\.util\.Scanner;"
    $noExplicitClose = $content -notmatch "\w+\.close\("
    $noTryWithResources = $content -notmatch "try\s*\(.*Scanner\s*.*=.*new\s+Scanner\s*\("
    
    if ($hasImport -and $noExplicitClose -and $noTryWithResources) {
        idea $_.FullName
    }
}