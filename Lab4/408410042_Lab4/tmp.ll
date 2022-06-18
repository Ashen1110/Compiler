@str1 = private unnamed_addr constant [20 x i8] c "a+b=%d, a=%d, b=%d\0A\00", align 1
@str2 = private unnamed_addr constant [13 x i8] c "Hello world\0A\00", align 1
; === prologue ====
declare dso_local i32 @printf(i8*, ...) #1

define dso_local i32 @main() #0
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
store i32 5, i32* %t1, align 4
store i32 10, i32* %t0, align 4
%t2=load i32, i32* %t1, align 4
%t3=load i32, i32* %t0, align 4
%t4 = add nsw i32 %t2, %t3
%t5=load i32, i32* %t1, align 4
%t6=load i32, i32* %t0, align 4
%t7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([20 x i8], [20 x i8]* @str1, i64 0, i64 0), i32 %t4, i32 %t5, i32 %t6)
%t8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str2, i64 0, i64 0))
ret i32 0

; === epilogue ===
}
attributes #0 = { noinline nounwind optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "min-legal-vector-width"="0" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false"}
