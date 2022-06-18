	.text
	.file	"test1.ll"
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
	movl	$1, -4(%rbp)
	movl	-4(%rbp), %eax
	addl	$100, %eax
	movl	-4(%rbp), %ecx
	addl	$2, %ecx
	imull	%ecx, %eax
	movl	%eax, -8(%rbp)
	movl	-8(%rbp), %esi
	movabsq	$.Lstr1, %rdi
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
	.asciz	"b: %d\n"
	.size	.Lstr1, 7

	.section	".note.GNU-stack","",@progbits
