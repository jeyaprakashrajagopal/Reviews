
É3
û
*BerlinTravelDestinationReviewsFragmentTest"com.anonymous.reviews.reviewmodule0testReviews_WhenReviewsGetLoaded_areViewsVisible2ˆ¢ˆíÄ˘ÍÂ:ˆ¢ˆí¿ÓΩáù+
ªjava.lang.IllegalStateException: Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: class androidx.fragment.app.testing.FragmentScenario$EmptyFragmentActivity
at dagger.hilt.internal.Preconditions.checkState(Preconditions.java:83)
at dagger.hilt.android.internal.managers.FragmentComponentManager.createComponent(FragmentComponentManager.java:75)
at dagger.hilt.android.internal.managers.FragmentComponentManager.generatedComponent(FragmentComponentManager.java:64)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.generatedComponent(Hilt_BerlinTravelDestinationReviews.java:86)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.inject(Hilt_BerlinTravelDestinationReviews.java:108)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.onAttach(Hilt_BerlinTravelDestinationReviews.java:59)
at androidx.fragment.app.Fragment.onAttach(Fragment.java:1783)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.onAttach(Hilt_BerlinTravelDestinationReviews.java:47)
at androidx.fragment.app.Fragment.performAttach(Fragment.java:2922)
at androidx.fragment.app.FragmentStateManager.attach(FragmentStateManager.java:464)
at androidx.fragment.app.FragmentStateManager.moveToExpectedState(FragmentStateManager.java:275)
at androidx.fragment.app.FragmentManager.executeOpsTogether(FragmentManager.java:2189)
at androidx.fragment.app.FragmentManager.removeRedundantOperationsAndExecute(FragmentManager.java:2100)
at androidx.fragment.app.FragmentManager.execSingleAction(FragmentManager.java:1971)
at androidx.fragment.app.BackStackRecord.commitNow(BackStackRecord.java:305)
at androidx.fragment.app.testing.FragmentScenario$Companion$internalLaunch$2.perform(FragmentScenario.kt:618)
at androidx.fragment.app.testing.FragmentScenario$Companion$internalLaunch$2.perform(FragmentScenario.kt:401)
at androidx.test.core.app.ActivityScenario.lambda$onActivity$2$ActivityScenario(ActivityScenario.java:660)
at androidx.test.core.app.ActivityScenario$$Lambda$4.run(Unknown Source:4)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:462)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at android.app.Instrumentation$SyncRunnable.run(Instrumentation.java:2266)
at android.os.Handler.handleCallback(Handler.java:938)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:201)
at android.os.Looper.loop(Looper.java:288)
at android.app.ActivityThread.main(ActivityThread.java:7839)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)java.lang.IllegalStateExceptionªjava.lang.IllegalStateException: Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: class androidx.fragment.app.testing.FragmentScenario$EmptyFragmentActivity
at dagger.hilt.internal.Preconditions.checkState(Preconditions.java:83)
at dagger.hilt.android.internal.managers.FragmentComponentManager.createComponent(FragmentComponentManager.java:75)
at dagger.hilt.android.internal.managers.FragmentComponentManager.generatedComponent(FragmentComponentManager.java:64)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.generatedComponent(Hilt_BerlinTravelDestinationReviews.java:86)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.inject(Hilt_BerlinTravelDestinationReviews.java:108)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.onAttach(Hilt_BerlinTravelDestinationReviews.java:59)
at androidx.fragment.app.Fragment.onAttach(Fragment.java:1783)
at com.anonymous.reviews.reviewmodule.Hilt_BerlinTravelDestinationReviews.onAttach(Hilt_BerlinTravelDestinationReviews.java:47)
at androidx.fragment.app.Fragment.performAttach(Fragment.java:2922)
at androidx.fragment.app.FragmentStateManager.attach(FragmentStateManager.java:464)
at androidx.fragment.app.FragmentStateManager.moveToExpectedState(FragmentStateManager.java:275)
at androidx.fragment.app.FragmentManager.executeOpsTogether(FragmentManager.java:2189)
at androidx.fragment.app.FragmentManager.removeRedundantOperationsAndExecute(FragmentManager.java:2100)
at androidx.fragment.app.FragmentManager.execSingleAction(FragmentManager.java:1971)
at androidx.fragment.app.BackStackRecord.commitNow(BackStackRecord.java:305)
at androidx.fragment.app.testing.FragmentScenario$Companion$internalLaunch$2.perform(FragmentScenario.kt:618)
at androidx.fragment.app.testing.FragmentScenario$Companion$internalLaunch$2.perform(FragmentScenario.kt:401)
at androidx.test.core.app.ActivityScenario.lambda$onActivity$2$ActivityScenario(ActivityScenario.java:660)
at androidx.test.core.app.ActivityScenario$$Lambda$4.run(Unknown Source:4)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:462)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at android.app.Instrumentation$SyncRunnable.run(Instrumentation.java:2266)
at android.os.Handler.handleCallback(Handler.java:938)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:201)
at android.os.Looper.loop(Looper.java:288)
at android.app.ActivityThread.main(ActivityThread.java:7839)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)"•

logcatandroidè
å/Users/jeyaprakashrajagopal/ReviewsGit/Reviews/app/build/outputs/androidTest-results/connected/Pixel_3a_API_31_arm64-v8a(AVD) - 12/logcat-com.anonymous.reviews.reviewmodule.BerlinTravelDestinationReviewsFragmentTest-testReviews_WhenReviewsGetLoaded_areViewsVisible.txt"Ø

device-infoandroidî
ë/Users/jeyaprakashrajagopal/ReviewsGit/Reviews/app/build/outputs/androidTest-results/connected/Pixel_3a_API_31_arm64-v8a(AVD) - 12/device-info.pb"∞

device-info.meminfoandroidç
ä/Users/jeyaprakashrajagopal/ReviewsGit/Reviews/app/build/outputs/androidTest-results/connected/Pixel_3a_API_31_arm64-v8a(AVD) - 12/meminfo"∞

device-info.cpuinfoandroidç
ä/Users/jeyaprakashrajagopal/ReviewsGit/Reviews/app/build/outputs/androidTest-results/connected/Pixel_3a_API_31_arm64-v8a(AVD) - 12/cpuinfo*î
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriverû
õ/Users/jeyaprakashrajagopal/ReviewsGit/Reviews/app/build/outputs/androidTest-results/connected/Pixel_3a_API_31_arm64-v8a(AVD) - 12/testlog/test-results.log 2
text/plain2¿
QOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriver"INSTRUMENTATION_FAILED*OTest run failed to complete. Instrumentation run failed due to Process crashed.