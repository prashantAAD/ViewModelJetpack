package www.revengerfitness.blogspot.com.viewmodeljetpack


import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() { // model classes are independent of views.only used to handle with data.do not hold reference of any view in this class because it will create memory leaks.

     var count: Int = 0

    fun increment() {
        count++

    }
}