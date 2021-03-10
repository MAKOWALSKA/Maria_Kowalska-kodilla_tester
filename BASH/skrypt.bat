del build/libs/*.jar
call gradlew build
if  [exist build\libs\*.jar]
then
    copy build\libs\*.jar C:\project\
else
    echo File does not exist. Compilation error.
fi
