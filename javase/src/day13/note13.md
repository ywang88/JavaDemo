一、缓冲字节流(基于内存)(TestBufferedInputStream)
   先把数据缓冲到内存中，在内存中做IO操作
    ，比直接基于硬盘的IO快75000多倍
   输入流:BufferedInputStream
   输出流:BufferedOutputStream
二、缓冲字符流(TestBufferedReader)
   输入流:BufferedReader
   输出流:BufferedWriter
三、转换流(TestStreamReader)
   转换输入流:InputStreamReader
   转换输出流:InputStreamWriter
四、标准输入输出流(TestInOut)
    
五、数据流
   数据输入流:DataInputStream
   数据输出流:DataOutputStream
六、对象流
   输入流:
   输出流:
七、随机存储流