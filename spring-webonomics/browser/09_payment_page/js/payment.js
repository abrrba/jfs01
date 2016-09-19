function validate_num() {
        var num = document.getElementById('contact').value;
        var length = num.toString().length;
        if ((length < 10) || (isNaN(num))) {
                window.alert("Invalid Number");
        }
}
//
//

