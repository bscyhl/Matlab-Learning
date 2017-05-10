Lecture 4:String and Cell
	1.字符串数组的构建与寻访
		1.字符串数组构建
			t='How about this character string?'
			>>size(t)
			ans=1 32
			>>whos
			
			
			Tips:
				1.用单引号引起来的内容被视作字符串数组，包括空格
				2.单引号必须是英文状态
		2.字符串数组与数值数组的转换
			>> t='ABCabc'
			t =
				ABCabc
			>> abs(t)
			ans =
				65    66    67    97    98    99
			>> shu=ans
			shu =
				65    66    67    97    98    99
			>> char(shu)
			ans =
				ABCabc
			*大小写的转换：
				1.加减32
				2.upper(),lower()方法
		3.字符串数组的寻访
			u=t(14:22)
	2.字符串函数
	3.元胞数组