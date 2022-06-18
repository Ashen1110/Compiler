	.text
	.file	"test3.ll"
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
	movl	$5, -4(%rbp)
	movl	$10, -8(%rbp)
	movl	-4(%rbp), %esi
	addl	-8(%rbp), %esi
	movl	-4(%rbp), %edx
	movl	-8(%rbp), %ecx
	movabsq	$.Lstr1, %rdi
	movb	$0, %al
	callq	printf
	movabsq	$.Lstr2, %rdi
	movb	$0, %al
	callq	printf
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
	.asciz	"a+b=%d, a=%d, b=%d\n"
	.size	.Lstr1, 20

	.type	.Lstr2,@object          # @str2
.Lstr2:
	.asciz	"Hello world\n"
	.size	.Lstr2, 13

	.section	".note.GNU-stack","",@progbits
