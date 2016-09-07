<!DOCTYPE html>
<html>
<body>

<?php
	$myfile = fopen("mytext.txt", "r") or die("Unable to open file!");
	echo fread($myfile,filesize("rishi.php"));
	fclose($myfile);
?>

</body>
</html>
