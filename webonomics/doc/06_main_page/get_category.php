<?php

// create connection
<<<<<<< HEAD
try {
        $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
=======
        $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');

//      $statement = $pdo->query("INSERT INTO categories (cat_id, cat_name) VALUES('$id', '$name')");
>>>>>>> master

        $statement = $pdo->query("SELECT * FROM categories");
        $row = $statement->fetchALL(PDO::FETCH_ASSOC);
    
        echo json_encode($row);
    
    } catch(PDOException $e) {

            echo $e->getMessage();
    
    }

?>
