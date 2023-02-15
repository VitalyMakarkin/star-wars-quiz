package com.example.starwarsquiz.feature.question.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.starwarsquiz.core.model.data.Person
import com.example.starwarsquiz.feature.question.domain.QuestionInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class QuestionViewModel @Inject constructor(
    private val questionInteractor: QuestionInteractor
) : ViewModel() {

    val questionUiState: StateFlow<QuestionUiState> = questionUiState()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000), // TODO
            initialValue = QuestionUiState.Loading
        )
}

private fun questionUiState(): Flow<QuestionUiState> {
    TODO()
}

sealed interface QuestionUiState {
    data class Success(val personList: List<Person>) : QuestionUiState
    object Error : QuestionUiState
    object Loading : QuestionUiState
}