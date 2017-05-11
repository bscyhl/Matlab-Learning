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
		4.字符串的拼接
			char()会把多个字符串拼接成多行数组
			
			其他函数
			|---------------------------------------------------|
			|str2mat	|字符串转换成一个文本矩阵(和char()一样)	|
			|---------------------------------------------------|
			|int2str	|整数转换成字符串						|
			|---------------------------------------------------|
			|str2num	|字符串转换成数字						|
			|---------------------------------------------------|
			|num2str	|数字转换成字符串						|
			|---------------------------------------------------|
			|setstr		|ASCII码转换成字符串(和char()一样)		|
			|---------------------------------------------------|
			|sprintf	|用格式控制，数字转换成字符串			|
			|---------------------------------------------------|
			|fprintf	|把格式化的文本写到文件中或显示屏上		|
			|---------------------------------------------------|
			|lower		|字符串转换成小写						|
			|---------------------------------------------------|
			|upper		|字符串转换成大写						|
			|---------------------------------------------------|
			
			例子：
				>> rad=45;area=13;
				>> t=sprintf('A circle of radius %.4g has an area of %.4g',rad,area)
				t =
					A circle of radius 45 has an area of 13
				>> fprintf('A circle of radius %.4g has an area of %.4g',rad,area)
					A circle of radius 45 has an area of 13>> 
				>> fprintf('A circle of radius %.4g has an area of %.4g\n',rad,area)
					A circle of radius 45 has an area of 13
				>>
	2.字符串函数
		eval		作为一个MATLAB命令求字符串的值
		feval		求由字符串给定的函数值
		deblank		去掉字符串中后拖的空格
		blanks(n)	返回一个N个零或空格的字符串
		findstr		从一个字符串内找出字符串
		isletter	字母存在时返回真值
		isspace		空格字符存在时返回真值
		isstr		输入是一个字符串，返回真值
		lasterr		返回上一个所产生MATLAB错误的字符串
		strcmp		字符串相同，返回真值
		strrep		用一个字符串替换另一个字符串
		strtok		在一个字符串中找出第一个标记
	3.元胞数组