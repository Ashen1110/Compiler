@str1 = private unnamed_addr constant [17 x i8] c "Announce a = 50\0A\00", align 1
@str2 = private unnamed_addr constant [21 x i8] c "b = a - 2*(-a) = %d\0A\00", align 1
@str3 = private unnamed_addr constant [5 x i8] c "a>b\0A\00", align 1
@str4 = private unnamed_addr constant [6 x i8] c "a<=b\0A\00", align 1
; === prologue ====
declare dso_local i32 @printf(i8*, ...) #1

define dso_local i32 @main() #0
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
store i32 50, i32* %t1, align 4
%t2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([17 x i8], [17 x i8]* @str1, i64 0, i64 0))
%t3=load i32, i32* %t1, align 4
%t4=load i32, i32* %t1, align 4
%t5 = sub nsw i32 0, %t4
%t6 = mul nsw i32 2, %t5
%t7 = sub nsw i32 %t3, %t6
store i32 %t7, i32* %t0, align 4
%t8=load i32, i32* %t0, align 4
%t9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([21 x i8], [21 x i8]* @str2, i64 0, i64 0), i32 %t8)
%t10=load i32, i32* %t1, align 4
%t11=load i32, i32* %t0, align 4
%cond2 = icmp sgt i32 %t10, %t11
br i1 %cond2, label %if_thenLabel_L1, label %elseLabel_L2
if_thenLabel_L1:
%t12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @str3, i64 0, i64 0))
br label %Lend_L3
elseLabel_L2:
%t13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str4, i64 0, i64 0))
br label %Lend_L3
Lend_L3:
 
ret i32 0

; === epilogue ===
}
attributes #0 = { noinline nounwind optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "min-legal-vector-width"="0" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false"}
