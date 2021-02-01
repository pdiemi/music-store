function userFormValidate(){
    document.getElementById("emailLabel").innerHTML="Email *:"
    document.getElementById("usernameLabel").innerHTML="Username *:"
    if(emailList.includes(document.userForm.email.value)) {
        document.getElementById("emailLabel").innerHTML="Email *:<p class='text-danger'>Email already exists</p>"
        document.userForm.email.focus()
        return false
    }
    
    if(usernameList.includes(document.userForm.username.value)) {
        document.getElementById("usernameLabel").innerHTML="Username *:<p class='text-danger'>Username already exists</p>"
        document.userForm.username.focus()
        return false
    }
    return true
}
