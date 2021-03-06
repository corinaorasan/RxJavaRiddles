package com.vanniktech.rxriddles

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

object Riddle8 {
    /**
     * Delay the entire [source] by 200ms. This includes subscribing, emissions and terminal events.
     *
     * Use case: Make an Observable "lazy" for some time. For instance, when wanting to postpone some UI action.
     */
    fun solve(source: Observable<Unit>): Observable<Unit> =
            source.delaySubscription(200, TimeUnit.MILLISECONDS)
}
