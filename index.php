<?php
# 1. Online Order
# 2. Book Table
# 3. Votes
# 4. Location
# 5. Rest Type
# 6. Dish Liked
# 7. Cuisines
# 8. Type
# 9. Cost for two people

$online_order = isset($_GET['online_order']) ? $_GET['online_order'] : '0';
$book_table = isset($_GET['book_table']) ? $_GET['book_table'] : '0';
$votes = isset($_GET['Votes']) ? $_GET['Votes'] : '0';
$location = isset($_GET['location']) ? $_GET['location'] : '0';
$rest_type = isset($_GET['rest_type']) ? $_GET['rest_type'] : '0';
$dish_liked = isset($_GET['dish_liked']) ? $_GET['dish_liked'] : '0';
$cuisines = isset($_GET['cuisines']) ? $_GET['cuisines'] : '0';
$type = isset($_GET['type']) ? $_GET['type'] : '0';
$city = isset($_GET['city']) ? $_GET['city'] : '7';
$costfortwo = isset($_GET['costfortwo']) ? $_GET['costfortwo'] : '0';

$k = shell_exec("python3 mymlproject.py '$online_order' '$book_table' '$votes' '$location' '$rest_type' '$dish_liked' '$cuisines' '$city' '$type' '$costfortwo'| tail -n1 | tr -d '[]'");
echo $k;
?>