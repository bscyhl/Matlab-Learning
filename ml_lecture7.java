Lecture7:Matlab Programming
	1.脚本文件
		.m文件----脚本文件
				|-函数文件
		.mat文件
		
		(1).m文件的命名
			以字母开头
			不能与matlab内部函数文件重名
		(2)执行
			直接点击run
			直接在cmdwindow中输入函数名
			
		脚本文件的特点：
			本质特征：一串按用户意图排列而成的
	2.函数文件
		基本构成：
			函数申明行
			H1行
			帮助文本
			编写修改记录
			函数体
			+-----------------------------------------------------------------------+
			|function y = mean(x,dim)												|
			|%MEAN   Average or mean value.											|
			|%   For vectors, MEAN(X) is the mean value of the elements in X. For	|
			|%   matrices, MEAN(X) is a row vector containing the mean value of		|
			|%   each column.  For N-D arrays, MEAN(X) is the mean value of the		|
			|%   elements along the first non-singleton dimension of X.				|
			|%																		|
			|%   MEAN(X,DIM) takes the mean along the dimension DIM of X. 			|
			|%																		|
			|%   Example: If X = [1 2 3; 3 3 6; 4 6 8; 4 7 7];						|
			|%																		|
			|%   then mean(X,1) is [3.0000 4.5000 6.0000] and 						|
			|%   mean(X,2) is [2.0000 4.0000 6.0000 6.0000].'						|
			|%																		|
			|%   Class support for input X:											|
			|%      float: double, single											|
			|%																		|
			|%   See also MEDIAN, STD, MIN, MAX, VAR, COV, MODE.					|
			|																		|
			|%   Copyright 1984-2009 The MathWorks, Inc. 							|
			|%   $Revision: 5.17.4.5 $  $Date: 2010/09/02 13:35:22 $				|
			|																		|
			|if nargin==1, 															|
			|% Determine which dimension SUM will use								|
			|dim = find(size(x)~=1, 1 );											|
			|if isempty(dim), dim = 1; end											|
			|																		|
			|y = sum(x)/size(x,dim);												|
			|else																	|
			|y = sum(x,dim)/size(x,dim);											|
			|end																	|
			+-----------------------------------------------------------------------+
			
			*必须有function关键字作为引导（函数申明行）
			*可以给函数传入比‘标称变量’少的参量（类似重载）
			*每当函数运行时，Matlab会为它开辟临时空间，运行完会释放，所以要及时保存变量
			*如果函数文件调用了脚本文件，那么脚本文件中的变量不会存储在Workspace，会随着函数文件的临时工作空间释放
			Tips:
				1.尽量函数名和文件名一致
				2.
				
			局部变量和全局变量：
				局部变量：
					它存在于函数空间内部的中间变量，产生于该函数的运行过程中，其影响范围也仅限于该函数本身。
				全局变量：
					通过global指令定义变量，Matlab也允许几个不同的函数空间以及基本工作空间共享同一个变量。这种被共享
					的变量称为全局变量。每个希望共享全局变量的函数或Matlab基本工作空间，必须逐个用global对具体变量
					加以专门定义。没有采用global定义的函数或基本工作空间，将无权想用全局变量。
					
				Tips：
					除非与全局变量联系的所有工作空间都被删除，否则全局变量依然存在。
					对全局变量的定义必须是在对全局变量的使用之前。建议把定义放在首行。
					建议用大写字符命名全局变量。
					由于全局变量损害函数的封装性，因此不提倡使用全局变量。
					
			函数的类型：
				1.主函数和子函数
					function f=jisuan(x)
						f=fun1(x)+fun2(x);
						function y=fun1(x)
							y=x*2+3;
						end
						function z=fun2(x)
							z=x^3+5;
						end
					end
					
					Tips：
						输入参数在函数执行过程中的变化，只在函数体内有效，不改变原值。
						输出参数在函数执行完毕后将保留在workspace中，但若在函数调用时未将其赋给其他变量，则不会保留。
						若输入参数在函数体内有缺省值，则输入参数个数可以少于函数规定个数。
						函数文件名要与主函数相一致。
				2.匿名函数
					>>f=@(x,y)x*y
					>>f(2,3)
					ans=
						6
	3.matlab程序控制流
		1.for
			(1)不能在for循环内部控制循环变量；
			(2)如果for的控制变量等于一个数组，那么循环变量每次都取数组的一列
			(3)当有一个等效数组方法来解给定的问题时，应避免用for循环
			(4)为了得到最大的速度，在for循环被执行之前，应预先分配数组
			题目：用for循环输出1到1000的和
				s=0;
				for n=1:1000
					s=s+n;
				end
				disp(s)
				
		2.while
			while expression
				command
			end
			
			注意：在command里必须有一句能控制循环变量的，使while能够停止。
			(1)用while循环输出1到1000的和
			s=0;i=1;
			while (i<=1000)
				s=s+i;
				i=i+1;
			end
			disp(s)
			
			(2)输入若干数，输入为0时终止输入。最后输出这个数组的和。
			i=1
			N=input('input a number')
			while(N~=0)
				A(i)=N;
				i=i+1;
				N=input('input a number')
			end
			disp('终止输入')
			disp('和为：');
			disp(sum(A))
			
		3.break和continue
			break语句使用在循环体中的时候，其作用是能够在执行循环体的时候强迫终止循环。
			
			continue是终止本次循环，继续下次循环。
			
			i,j,k=0;
			for i=1:2
				for j=1:2
					for k=1:2
						if(k==2)
							disp('退出循环');
							break;
						end
						str=sprintf('I=%d,J=%d,K=%d',i,j,k);
						disp(str);
					end
				end
			end
			disp('程序结束')
			
			输出结果：
			I=1,J=1,K=1
			退出循环
			I=1,J=2,K=1
			退出循环
			I=2,J=1,K=1
			退出循环
			I=2,J=2,K=1
			退出循环
			程序结束
			
		4.if else
		5.switch case
			
			switch ex
				case test1
					(commands 1)
				case test2
					(commands 2)
				case testk
					(commands k)
				otherwise
					(commands)
			end
			
			clear all;
			n=input('输入n=')
			switch fix(n/10);
				case {9,10}
					r='A';
			end
			
		6.try-catch
		
			x=rand(3);
			y=eye(2);
			try
				z=x+y;
				disp(z);
			catch
				errordlg('can not plus','哈哈')
			end