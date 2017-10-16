####base
```python
import tensorflow as tf

# Create TensorFlow object called tensor
hello_constant = tf.constant('Hello World!')

x = tf.placeholder(tf.string)
y = tf.placeholder(tf.int32)
z = tf.placeholder(tf.float32)

with tf.Session() as sess:
    # Run the tf.constant operation in the session
    output = sess.run(hello_constant)
    output = sess.run(x, feed_dict={x: 'Test String', y: 123, z: 45.67})
    print(output)


```

####数学计算
```python
x = tf.add(5, 2)
x = tf.subtract(10, 4) # 6
y = tf.multiply(2, 5)  # 10
#tf.divide() 
```

####矩阵点积
```python
tf.matmul()
```

####数据类型转换
```python
tf.subtract(tf.cast(tf.constant(2.0), tf.int32), tf.constant(1))
```

####从一个正态分布中生成随机数
```python
n_features = 120
n_labels = 5
weights = tf.Variable(tf.truncated_normal((n_features, n_labels)))
```

####随机初始化
```python
weights = tf.Variable(tf.random_normal([n_input, n_classes]))
bias = tf.Variable(tf.random_normal([n_classes]))
```

####保存变量
```python
import tensorflow as tf

# The file path to save the data
# 文件保存路径
save_file = './model.ckpt'

# Two Tensor Variables: weights and bias
# 两个 Tensor 变量：权重和偏置项
weights = tf.Variable(tf.truncated_normal([2, 3]))
bias = tf.Variable(tf.truncated_normal([3]))

# Class used to save and/or restore Tensor Variables
# 用来存取 Tensor 变量的类
saver = tf.train.Saver()

with tf.Session() as sess:
    # Initialize all the Variables
    # 初始化所有变量
    sess.run(tf.global_variables_initializer())

    # Show the values of weights and bias
   # 显示变量和权重
    print('Weights:')
    print(sess.run(weights))
    print('Bias:')
    print(sess.run(bias))

    # Save the model
    # 保存模型
    saver.save(sess, save_file)
```

####加载变量
```python
# Remove the previous weights and bias
# 移除之前的权重和偏置项
tf.reset_default_graph()

# Two Variables: weights and bias
# 两个变量：权重和偏置项
weights = tf.Variable(tf.truncated_normal([2, 3]))
bias = tf.Variable(tf.truncated_normal([3]))

# Class used to save and/or restore Tensor Variables
# 用来存取 Tensor 变量的类
saver = tf.train.Saver()

with tf.Session() as sess:
    # Load the weights and bias
    # 加载权重和偏置项
    saver.restore(sess, save_file)

    # Show the values of weights and bias
    # 显示权重和偏置项
    print('Weight:')
    print(sess.run(weights))
    print('Bias:')
    print(sess.run(bias))
```