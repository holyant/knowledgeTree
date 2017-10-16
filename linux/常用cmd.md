##shell相关
####脚本中包含密码
>echo 'Fyh2017' | sudo -S ./deploy.sh bbd

###高性能快速清理日志
>cp /dev/null nohup.out

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
>1. find ./ -name  * DS_Store*
2. find ./ -type f -name "*.log" | xargs grep -i "Q2016061300004"
3. -i 忽略大小写
4. grep  home /etc/passwd 查含home的行
5. grep  -r home /etc/passwd 查含home的行(包含子目录)
6. grep aaa test.txt（在test.txt中搜索包含aaa内容）

##ip相关
>1. ifconfig -a 显示ip地址
2. ping探测与某电脑是否联通
  （ping 172.18.2.208）
3. telnet 172.18.2.208 1433 探测与某端口是否联通
 
##进程相关
>1. jobs 显示后台作业
2. sleep 100 睡眠100s
3. ctrl +z暂停进程
4. bg 3 把  变成运行的状态
5. kill %3 终止后台任务
6. kill -9 23821 绝杀
7. ps -ef | grep bbdservice | grep -v grep | awk '{print $2}' | xargs kill -9 用一个脚本杀死一个已知名字的进程

##打包
>1. 打包： tar -cf soft.tar soft
2. Tar -cvf
3. 解包： tar -xf soft.tar soft
4. 压缩目录
5. 打包压缩：tar czvf usr.tar.gz /home
6. Gzip workspace.tar
7. 解压缩：tar xzvf usr.tar.gz
8. 压缩文件（对于目录失效）
9. 压缩：zip good.zip good1 good2
10. zip -r good.zip good1 good2
11. 解压：unzip good.zip
12. 解压：tar vxfj …bz2
13. 解压 gunzip jdk-7u45-linux-x64.gz

###模拟url post
>1. curl -H "Content-type:application/json" -X POST -d '{"userName":"admin","orderId":"S2017050300001","contractId":"hello","productType":"PET","demander":"需方","provider":"供方","count":"100","totalPrice":"100000","defaultDemandConsultFee":"1","defaultProviderConsultFee":"2"}' http://bpm-test.huaxianbang.com/api/bpm/startSelfSalesOrder
2. get方式
curl www.baidu.com

###用户新建
>1. sudo useradd -d /home/liyuxin -m  -s /bin/bash liyuxin
2. sudo passwd  liyuxin
3. sudo vim /etc/sudoers

###vim下忽略大小写查找
> 1. /xxx\c
2. 回退 u
3. 撤销回退 ctrl + r