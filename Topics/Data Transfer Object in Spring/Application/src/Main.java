class AuthorStatsDTO {
    //your implementation
    private long id;
    private String name;
    private int blogsNumber;

    public AuthorStatsDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.blogsNumber = user.getBlogs().size();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlogsNumber() {
        return blogsNumber;
    }

    public void setBlogsNumber(int blogsNumber) {
        this.blogsNumber = blogsNumber;
    }
}