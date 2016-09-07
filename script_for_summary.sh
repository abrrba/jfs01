
students="stu_a0001 stu_a0002 stu_a0003 stu_a0004 stu_a0005 stu_a0006 stu_a0007"

for student in $students; do
    main_files=`find $student -name MainAsg* | wc -l` 
    asg_files=`find $student -name Asg* | wc -l` 
    makefiles=`find $student -name Makefile | wc -l` 
    testfiles=`find $student -name TestAsg* | wc -l`
    echo "Student $student MainFiles $main_files AssignmentFiles $asg_files Makefiles $makefiles TestFiles $testfiles"
done

