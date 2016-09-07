<?php

// try-catch is a way to handle error cases. 
// If the command encounters an error, the catch statements will be printed.

try {

        // Give incorrect username and password in the line below to check 
        // try catch.

        $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
    
    } catch(PDOException $e) {
    
        echo $e->getMessage();
        die();
    }

    // We have the connection, now we can run a query.

    // Get all the users.
    $statement = $pdo->query("SELECT * FROM myzone_users");

    // We have all the rows in the $row variable. Its actually a dictionary.
    // i.e. it saves the element in name-value pairs.

    $row = $statement->fetchALL(PDO::FETCH_ASSOC);

    print_r($row);

    // Using foreach we can iterate on each array.

    foreach ($row as $entry) {
        print_r ($entry);
    }


    // We can access the variables in this way.

    print ("\nPrinting the names\n");
    foreach ($row as $entry) {
        print ($entry["name"]. "\n");

    }

?>
