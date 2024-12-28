package com.example.standardofsplit.presentation.ui.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.standardofsplit.R
import com.example.standardofsplit.presentation.ui.component.CircleButton
import com.example.standardofsplit.presentation.ui.component.SubmitButton
import com.example.standardofsplit.presentation.ui.theme.Typography
import com.example.standardofsplit.presentation.viewModel.StartViewModel

@Composable
private fun PersonCountSelector(
    onIncrement: () -> Unit,
    onDecrement: () -> Unit,
    personCount: Int,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        CircleButton(
            text = "-",
            onClick = onDecrement
        )
        Text(
            text = "$personCount",
            modifier = Modifier.padding(horizontal = 40.dp),
            style = Typography.countTextStyle
        )
        CircleButton(
            text = "+",
            onClick = onIncrement
        )
    }
}

@Composable
private fun StartScreenContent(
    onNext: () -> Unit,
    onIncrement: () -> Unit,
    onDecrement: () -> Unit,
    personCount: Int,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .offset(y = 220.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .offset(y = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PersonCountSelector(
                onIncrement = onIncrement,
                onDecrement = onDecrement,
                personCount = personCount,
            )
            Text(
                text = "※ 인원 수를 선택해주세요 ※",
                modifier = Modifier.padding(top = 5.dp),
                style = Typography.defaultTextStyle
            )
            Text(
                text = "2 ~ 8명",
                style = Typography.defaultTextStyle
            )
        }
        SubmitButton(
            text = "시작하기",
            onClick = onNext,
            modifier = Modifier
                .padding(top = 70.dp)
        )
    }
}

@Composable
fun StartScreen(
    startViewModel: StartViewModel,
    onNext: () -> Unit,
) {

    val personCount by startViewModel.personCount.collectAsState()

    val context = LocalContext.current

    BackHandler {
        startViewModel.exit(context = context)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-70).dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "영수증 아이콘",
            modifier = Modifier
                .size(380.dp)
                .offset(y = (-20).dp),
            colorFilter = ColorFilter.tint(Color.DarkGray),
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "N빵",
                style = Typography.firstTitleTextStyle
            )
            Text(
                text = "의 정석",
                modifier = Modifier.padding(top = 24.dp),
                style = Typography.secondTitleTextStyle
            )
        }
    }
    StartScreenContent(
        personCount = personCount,
        onIncrement = startViewModel::incrementCount,
        onDecrement = startViewModel::decrementCount,
        onNext = onNext
    )
}