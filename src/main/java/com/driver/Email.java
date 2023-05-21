package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
       if(oldPassword.equals(password)){
           if(isValid(newPassword)){
               System.out.println("PassWord Changed SuccessFully");
            this.password =newPassword;
           }
           else{
               System.out.println("PassWord is not valid");
           }
       }
       else {
           System.out.println("Given PassWord does not matches the Current PassWord");
       }
    }
    private Boolean isValid(String password){
        if(password.length()<8){
            return false;
        }
        Boolean capitalLetter=false;
        Boolean smallLetter=false;
        Boolean number=false;
        Boolean specialCharacter=false;
        for(int i=0;i<password.length();i++){
            char val=password.charAt(i);
            if(val>='a' && val<='z'){
                smallLetter=true;
            }
            else if(val >='A' && val<='Z'){
                capitalLetter=true;
            }
            else if(val >=0 && val<=9){
                number=true;
            }
            else{
                specialCharacter=true;
            }
        }
        if(capitalLetter && smallLetter && number & specialCharacter){
            return true;
        }
        return false;
    }
}
