package com.mindorks.framework.jetpack.data.database

import androidx.lifecycle.LiveData
import com.mindorks.framework.jetpack.data.database.repository.options.Option
import com.mindorks.framework.jetpack.data.database.repository.questions.Question
import io.reactivex.Observable

/**
 * Created by jyotidubey on 2019-03-05.
 */
interface DBHelper {
    fun getAllQuestions(): LiveData<List<Question>>?

    fun getOptionsForQuestionId(questionId: Long?): List<Option>?

    fun isOptionEmpty(): Observable<Boolean>

    fun isQuestionEmpty(): Observable<Boolean>
    
    fun saveOptionList(optionList: List<Option>): Observable<Boolean>

    fun saveQuestionList(optionList: List<Question>): Observable<Boolean>

}