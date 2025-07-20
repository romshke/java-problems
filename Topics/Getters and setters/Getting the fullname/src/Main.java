class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        try {
            if (firstName != null || !firstName.isEmpty()) {
                this.firstName = firstName;
            }
        } catch (NullPointerException ignored) {}
    }

    public void setLastName(String lastName) {
        // write your code here
        try {
            if (lastName != null || !lastName.isEmpty()) {
                this.lastName = lastName;
            }
        } catch (NullPointerException ignored) {}
    }

    public String getFullName() {

        if (!firstName.isEmpty() && lastName.isEmpty()) {
            return firstName;
        }

        if (firstName.isEmpty() && !lastName.isEmpty()) {
            return lastName;
        }

        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            return firstName + " " + lastName;
        }

        return "Unknown";
    }
}