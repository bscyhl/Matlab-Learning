 Lecture 2: Matlab Basis

	1 Matlab Desktop
		1.文件 .mat和 .m
			    |		\
			  数据文件  脚本文件、函数文件

		2.new>Script 和 edit命令功能一样
		3.识别的文件：-.mat .xls .txt
							   \ /
							   数值（xls去掉表头）（txt用Tab键）

		4.clear命令
		5.figure命令（画图）


	2 Command Window introduction
		(1)交互靠：菜单、命令（指令）、程序
		   命令 >>
		   程序 >> 
			 K>>
			 
		   变量输入：
			erasers = 4
			tape = 2;
		(2)Matlab中的保留字
			for switch otherwise global 
		(3)matlab的预定义变量
			变量名       含义
			inf或Inf     无穷大，如1/0
			eps          机器零阈值
			i或j		 循环计数
			nargin		 函数的输入参数个数
			nargout		 函数的输出参数个数
			realmin		 最小正浮点数值
			realmax		 最大正浮点数值
			bitmax		 最大正整数
			ans			 计算结果缺省变量
			
			指令行中的标点符号：
			“，”“；”逗号和分号的区别在于分号之前的变量不会显示在屏幕；
			        在矩阵中，逗号和分号分别用于区分元素和纬度；
			“：”冒号用以生成一位数值数组；用作单下标援引时，表示全部元素构成的长列；用作多下标援引时，表示那维上的全部
			“%”百分号用于注释，由它“起首”后的所有物理行都被看作非执行的注释
			
			所有的数值数组的元素援引都要用圆括号
			例子：
			 CC = magic(4)
			 a=CC(2,[1,4])
			 f=[CC(2,:);CC(3,:)]
			 s=1:9
			 s=1:3:9
			 
	3 指令窗的常用控制指令
		cd		设置当前工作目录
		clf		清除图形窗
		clc		清除指令窗中显示内容
		clear	清除Matlab工作空间中保存的内容
		dir		列出指定目录下的文件和子目录清单
		edit	打开M文件编辑器
		exit	关闭/退出Matlab
		quit	关闭/退出Matlab
		mkdir	创建目录
		more(on/off)
				使其后面的显示内容分页进行
		type	显示指定M文件的内容
		which	指出其后的文件所在的目录

		format			
		format short	通常保证小数点后4位有效，最多不超过7位
		format long		15位数字表示
		format long e	
		format short e
		
		
	5 Current Dictionary
		某名称只要在搜索路径中，即使不在当前编辑目录下，也可以搜索到。
		
		matlab搜索‘cow’的顺序：
		1.在内存种进行检查，看cow是不是变量，假如不是变量，下一步；
		2.检查cow是不是内建目录，不是，下一步；
		3.再当前目录，看有没有cow.m；
		4.再Matlab搜索路径的其他目录中，检查是否有cow.m

		添加搜索路径：
			path(path,'c:\mydir')----把'c:\mydir'设置为path的首端；
			path('c:\mydir',path)----把'c:\mydir'设置为path的尾端；
			
	6 WorkSpace Browser and Array Editor
		显示内存中当前存储的变量的窗口
			
		相关的管理指令：
			who
			whos
			clear (变量名 变量名2 变量名3)
			
		相关编辑指令：
			save + 文件名 [变量名] [-append]
			load + 文件名
			
			
			