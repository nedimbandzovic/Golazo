package com.example.golazo;
import androidx.room.Entity;
@Entity(tableName = "users")
public class User {
    @PrimaryKey(autoGenerate = true)
    Integer id;

    @ColumnInfo(name="username")
    String username;

    @ColumnInfo (name="password")
    String password;

    @ColumnInfo (name="firstname")
    String firstname;

    @ColumnInfo (name="lastname")
    String lastname;

    @ColumnInfo (name="Email")
    String Email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String newFirstName) {
        firstname = newFirstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String newLastName) {
        this.lastname = newLastName;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail (String email){
        this.Email=email;
    }
}
