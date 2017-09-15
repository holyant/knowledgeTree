###清理日志
>cp /dev/null nohup.out
###ls 
>（-a点开头的为隐藏文件，-F显示文件夹，-t 按时间排序 ll -t|tac 按时间倒序，-R 列子目录，-l 列出long信息，–help 列出帮助信息 -r 时间倒序）
##统计大小
###du  -sh
>查看一个目录大小（ disk usage s：只显示各档案大小的总合）
###du -sm * | sort -n 
>统计当前目录大小，并按大小排序
###df  -lh 
>查看磁盘空闲空间大小（）
###top -u weblogic 
>查看CPU和内存使用情况
 
###chmod
>(chmod o-x text  ，Chmod u+x text  ，Chmod g-w text，Chmod 666 text)

##查找
>find ./ -name  * DS_Store*
find ./ -type f -name "*.log" | xargs grep -i "Q2016061300004"
-i 忽略大小写
grep  home /etc/passwd 查含home的行
grep  -r home /etc/passwd 查含home的行(包含子目录)
grep aaa test.txt（在test.txt中搜索包含aaa内容）

##ip相关
>ifconfig -a 显示ip地址
ping探测与某电脑是否联通
  （ping 172.18.2.208）
telnet 172.18.2.208 1433 探测与某端口是否联通
 
##进程相关
>jobs 显示后台作业
sleep 100 睡眠100s
ctrl +z暂停进程
bg 3 把  变成运行的状态
kill %3 终止后台任务
kill -9 23821 绝杀
ps -ef | grep bbdservice | grep -v grep | awk '{print $2}' | xargs kill -9 用一个脚本杀死一个已知名字的进程

##打包
>打包： tar -cf soft.tar soft
Tar -cvf
解包： tar -xf soft.tar soft
压缩目录
打包压缩：tar czvf usr.tar.gz /home
Gzip workspace.tar
解压缩：tar xzvf usr.tar.gz
压缩文件（对于目录失效）
压缩：zip good.zip good1 good2
zip -r good.zip good1 good2
解压：unzip good.zip
解压：tar vxfj …bz2
解压 gunzip jdk-7u45-linux-x64.gz

###模拟url post
>curl -H "Content-type:application/json" -X POST -d '{"userName":"admin","orderId":"S2017050300001","contractId":"hello","productType":"PET","demander":"需方","provider":"供方","count":"100","totalPrice":"100000","defaultDemandConsultFee":"1","defaultProviderConsultFee":"2"}' http://bpm-test.huaxianbang.com/api/bpm/startSelfSalesOrder
get方式
curl www.baidu.com

###用户新建
>1. sudo useradd -d /home/liyuxin -m  -s /bin/bash liyuxin
2. sudo passwd  liyuxin
3. sudo vim /etc/sudoers

###vim下忽略大小写查找
> /xxx\c
回退 u
撤销回退 ctrl + r