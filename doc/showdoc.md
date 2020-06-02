一个标准语法例子：
    /**
    * showdoc
    * @catalog 测试文档/用户相关
    * @title 用户登录
    * @description 用户登录的接口
    * @method get
    * @url https://www.showdoc.cc/home/user/login
    * @param username 必选 string 用户名  
    * @param password 必选 string 密码  
    * @param name 可选 string 用户昵称  
    * @return {"error_code":0,"data":{"uid":"1","username":"12154545","name":"吴系挂","groupid":2,"reg_time":"1436864169","last_login_time":"0"}}
    * @return_param groupid int 用户组id
    * @return_param name string 用户昵称
    * @remark 这里是备注信息
    * @number 99
    */
    
关键字
说明
@catalog
生成文档要放到哪个目录。如果只是二级目录，则直接写目录名字。如果是三级目录，而需要写二级目录/三级目录，即用/隔开。如”一层/二层/三层”
@title
表示生成的文档标题
@description
是文档内容中对接口的描述信息
@method
接口请求方式。一般是get或者post
@url
接口URL
@param
参数表格说明。一行注释对应着表格的一行。用空格或者tab符号来隔开每一列信息。
@return
返回内容。请把返回内容压缩在同一行内。如果是json，程序会自动进行格式化展示。 如果是非json内容，则原样展示。
@return_param
返回参数的表格说明。一行注释对应着表格的一行。用空格或者tab符号来隔开每一列信息。
@remark
备注信息
@number
可选。文档的序号。