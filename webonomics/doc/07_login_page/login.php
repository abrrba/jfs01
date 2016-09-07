<?php

/*
 * Copyright: www.crestrou.com
 */


$uname = $_POST['uname'];
$passwd = $_POST['pwd'];
$pas_len = strlen($passwd);

// create connection
<<<<<<< HEAD

try {

        /*
         * Here we will be connecting to the MySql DataBase, we will get the connection
         * in the $pdo. 
         * 
         * For running any operation we will need this connection.
         */

        $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');

        /*
         * We will get the ``signin`` variable set if the user has pressed
         * the sign_in button. This means that we need to get into 
         * 1. Checking if the user is present or not in the data base.
         * 2. Check if the password sent is the same as that of the one stored in the data base.
         * 3. If it works fine, we proceed to the next page while passing the vaiable to the next page.
         */

        if (isset($_POST['signin'])) {

        
            // Get all the users.
            $statement = $pdo->query("SELECT * FROM myzone_users WHERE name='$uname' AND password='$passwd'");
            
            // We have all the rows in the $row variable.
            $row = $statement->fetchALL(PDO::FETCH_ASSOC);

            if ($row) {
                    header("Location: ../06_main_page/main_page.html?n=$uname" );
            } else {
                echo "<script>alert('The Username/Password is incorrect');</script>";
                echo "<script> window.location = 'login.html';</script>";
=======
$pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');

if (isset($_POST['signin'])) {
    //signin action

    $statement = $pdo->query("SELECT * FROM myzone_users");
    $row = $statement->fetchALL(PDO::FETCH_ASSOC);
    $match = "found";
  
        foreach ($row as $entry) {
            if($entry['name'] == $uname and $entry['password'] == $passwd){
                $match = "found";
                header("Location: ../06_main_page/main_page.html?n=$uname" );
                break;
            }
            else {
                $match = "not found";
                continue;
>>>>>>> master
            }

        } else {
            
            //signup action
            $statement = $pdo->query("SELECT * FROM myzone_users WHERE name='$uname' AND password='$passwd'");
            $row = $statement->fetchALL(PDO::FETCH_ASSOC);
            
            // If row has something, the userexists.
            if ($row) {

                echo "<script>alert('The Username already exists');</script>";
                echo "<script> window.location = 'login.html';</script>";
            
            } else {
            
                $statement = $pdo->query("INSERT INTO myzone_users (name, password) VALUES('$uname', '$passwd')");
                echo "<script>alert('Account Created. Please Login!!');</script>";
                echo "<script> window.location = 'login.html';</script>";
            
            }
        
        }

} catch(PDOException $e) {

        echo $e->getMessage();

}
?>
