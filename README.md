这是一个框架测试Demo总共使用的框架有：
Retrofit2
Rxjava2
Glide4
Butterknife
Gson
EventBus
主要是为了测试所有框架之间版本是否会有冲突，其次是熟悉操作流程，为项目引入框架做准备，还有一个GreenDAO框架没有测试，后续补上。
具体demo的功能是一个简单的登陆功能，交互服务器。
登陆界面使用Retrofit+Rxjava+mvp实现异步网络请求，然后根据服务器返回结果执行后续操作。
登陆成功后进入一个异步加载图片的功能，其中使用Glide加载网络图片，使用EventBus在不同的Activity中进行通信。