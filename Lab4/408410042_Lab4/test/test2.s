	.text
	.file	"test2.ll"
	.globl	main                    # -- Begin function main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$16, %rsp
	movl	$50, -4(%rbp)
	movabsq	$.Lstr1, %rdi
	movb	$0, %al
	callq	printf
	xorl	%eax, %eax
	movl	-4(%rbp), %ecx
	subl	-4(%rbp), %eax
	shll	$1, %eax
	subl	%eax, %ecx
	movl	%ecx, -8(%rbp)
	movl	-8(%rbp), %esi
	movabsq	$.Lstr2, %rdi
	movb	$0, %al
	callq	printf
	movl	-4(%rbp), %eax
	cmpl	-8(%rbp), %eax
	jle	.LBB0_2
# %bb.1:                                # %if_thenLabel_L1
	movabsq	$.Lstr3, %rdi
	movb	$0, %al
	callq	printf
	jmp	.LBB0_3
.LBB0_2:                                # %elseLabel_L2
	movabsq	$.Lstr4, %rdi
	movb	$0, %al
	callq	printf
.LBB0_3:                                # %Lend_L3
	xorl	%eax, %eax
	addq	$16, %rsp
	popq	%rbp
	.cfi_def_cfa %rsp, 8
	retq
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
	.cfi_endproc
                                        # -- End function
	.type	.Lstr1,@object          # @str1
	.section	.rodata.str1.1,"aMS",@progbits,1
.Lstr1:
	.asciz	"Announce a = 50\n"
	.size	.Lstr1, 17

	.type	.Lstr2,@object          # @str2
.Lstr2:
	.asciz	"b = a - 2*(-a) = %d\n"
	.size	.Lstr2, 21

	.type	.Lstr3,@object          # @str3
.Lstr3:
	.asciz	"a>b\n"
	.size	.Lstr3, 5

	.type	.Lstr4,@object          # @str4
.Lstr4:
	.asciz	"a<=b\n"
	.size	.Lstr4, 6

	.section	".note.GNU-stack","",@progbits
