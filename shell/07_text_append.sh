#! /bin/bash

echo -e "Enter the name of the file : \c"
read file_name

if [ -f $file_name ]
then
	# -w : writable permissions
	# chmod + x test.txt : give file a writable permissions
	if [ -w $file_name ]
	then
		echo "Type some text data. To quit press ctrl+d"
		# >> : add texts
		cat >> $file_name
	else
		echo "The file do not have write permissions"
	fi
else
	echo "$file_name does not exists"
fi
