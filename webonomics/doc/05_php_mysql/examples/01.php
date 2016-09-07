<?php
    $x = 5;         //Semi Colon is must. Variables must have a ``$`` in the front of it.
    $y = 6;

    echo "\n$x+$y";   // Here the whole thing got converted to a string due to ""
    
    echo  "\n";      // Print a new line;     
    echo $x+$y;     // They are integers here.
    echo  "\n";      // Print a new line;     

    $a = array (10, 11, 12, 13, 14);

    echo "Element 0 in the arrays is " . $a[0];
    echo  "\n";      // Print a new line;     

    $x = "Hello";
    $y = "World";

    $z = $x . $y; // Add two strings, without a string in between.

    echo $z;
    echo  "\n";      // Print a new line;     
    
    $z = $x . " " . $y; // Add two strings, without a string in between.
    echo $z;
    echo  "\n";      // Print a new line;     

?>
