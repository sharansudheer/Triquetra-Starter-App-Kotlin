package com.tibesto.kotlintemplateformapp.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.dataStoreFile
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton
import com.example.myapp.UserSettings // generated from your .proto file
import com.example.myapp.UserSettingsSerializer // your custom serializer



@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun providePreferencesDataStore(
        @ApplicationContext context: Context
    ): DataStore<Preferences> = PreferenceDataStoreFactory.create(
        produceFile = { context.dataStoreFile("app_prefs.preferences_pb") }
    )

    @Provides
    @Singleton
    fun provideProtoDataStore(
        @ApplicationContext context: Context
    ): DataStore<UserSettings> = DataStoreFactory.create(
        serializer = UserSettingsSerializer,
        produceFile = { context.dataStoreFile("user_settings.pb") }
    )
}