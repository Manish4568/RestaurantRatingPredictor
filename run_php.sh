echo "Extracting 7z file..."
rm model.pkl >>/dev/null 2>&1|| true
7z x model.7z >> /dev/null 2>&1
echo "Running PHP Script..."
pkill -9 php
{ php -S 127.0.0.1:5566 index.php >>/dev/null 2>&1; }&
echo "PHP Script is being run..."
Powershell.exe start chrome 'file://wsl.localhost/Ubuntu/home/manish/Zomato-Prediction/index.html'