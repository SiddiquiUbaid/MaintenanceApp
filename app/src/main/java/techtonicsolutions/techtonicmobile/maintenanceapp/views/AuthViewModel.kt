package techtonicsolutions.techtonicmobile.maintenanceapp.views






//import com.ngasce.announcement.data.AnnouncementRepository
//import com.ngasce.announcement.model.AnnouncementDTO
//import com.ngasce.announcement.model.AnnouncementItem
//import com.ngasce.common.model.StudentDTO
//import com.ngasce.common.network.ErrorState
//import com.ngasce.common.network.NetworkResult
//import com.ngasce.common.ui.UIState
//import com.ngasce.common.utils.AnalyticsUtils
//import com.ngasce.common.utils.GlobalData
//import com.ngasce.common.utils.LiveSessionEligibilityHelper

import android.app.Application
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import techtonicsolutions.techtonicmobile.maintenanceapp.auth.BaseAuthRepository
import javax.inject.Inject
//


@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: BaseAuthRepository,
    application: Application
) :
    AndroidViewModel(application) {


//    var signupUiState: UIState by mutableStateOf(UIState.Loading)
//    var user = mutableStateListOf<AnnouncementItem>()
//    var isRefreshing = mutableStateOf(false)


    fun signUpWithEmail(email: String, password: String) {
        viewModelScope.launch {
            //announcementUiState = UIState.Loading
            //delay(1000)
            repository.signUpWithEmailPassword(email, password)

        }
    }




}