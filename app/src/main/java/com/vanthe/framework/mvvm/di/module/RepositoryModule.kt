package com.vanthe.framework.mvvm.di.module

import com.vanthe.framework.mvvm.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}