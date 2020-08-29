#! / bin/bash

# \c :  커서를 같은 라인에 유지
# -e : \를 사용하는 것을 가능하게 해줌
echo "Enter the name of the file : \c"
read file_name

# -e : 파일이 존재하는지 여부
# -f : 파일인지 여부
# -d : 디렉터리 여부
# -b : block special 파일 (비디오, 이미지 파일)
# -c : character spectial 파일
# -s : 파일이 비었는지 확인
# -r : read permission 여부 확인
# -w : write permission 여부 확인
# -x : execution permission 여부 확인
if [ -s $file_name ]
then
	echo "$file_name found"
else
	echo "$file_name not found"
fi
