##conda
####安装包
conda install numpy

####卸载包
conda remove package_name

####更新包
conda update package_name

####列出已安装的包
conda list

####创建环境
1. conda env create -f environment.yml
2. conda create -n py python=3.3(指定python版本)
3. conda create -n env_name list of packages(conda create -n my_env numpy)

####进入环境
source activate dlnd-tf-lab

####保存环境
conda env export > environment.yaml

####列出环境
conda env list

####删除环境
conda env remove -n env_name

##jupyter notebook
####安装
conda install jupyter notebook

####启动
jupyter notebook

