package com.transsion.subtitle.viewmodel;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.SubtitleLanguageMapBean;
import com.transsion.moviedetailapi.bean.SubtitleItem;
import com.transsion.subtitle.bean.SubtitleSearchListBean;
import com.transsion.subtitle.fragment.C19695i;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {151}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class SubtitleDownloadViewModel$searchSubtitleList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DownloadBean $downloadBean;
    final /* synthetic */ C19695i $keyword;
    final /* synthetic */ List<SubtitleLanguageMapBean> $languageList;
    final /* synthetic */ String $languages;
    final /* synthetic */ String $nextPage;
    final /* synthetic */ int $perPage;
    int label;
    final /* synthetic */ SubtitleDownloadViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/subtitle/bean/SubtitleSearchListBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$1", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {140, 140}, m97639m = "invokeSuspend")
    static final class C197361 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ DownloadBean $downloadBean;
        final /* synthetic */ C19695i $keyword;
        final /* synthetic */ List<SubtitleLanguageMapBean> $languageList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SubtitleDownloadViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C197361(SubtitleDownloadViewModel subtitleDownloadViewModel, DownloadBean downloadBean, C19695i c19695i, List<SubtitleLanguageMapBean> list, Continuation<? super C197361> continuation) {
            super(2, continuation);
            this.this$0 = subtitleDownloadViewModel;
            this.$downloadBean = downloadBean;
            this.$keyword = c19695i;
            this.$languageList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C197361 c197361 = new C197361(this.this$0, this.$downloadBean, this.$keyword, this.$languageList, continuation);
            c197361.L$0 = obj;
            return c197361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C197361) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC24998b = (InterfaceC24998b) this.L$0;
            SubtitleDownloadViewModel subtitleDownloadViewModel = this.this$0;
            DownloadBean downloadBean = this.$downloadBean;
            C19695i c19695i = this.$keyword;
            List<SubtitleLanguageMapBean> list = this.$languageList;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = subtitleDownloadViewModel.m82244s(downloadBean, c19695i, list, this);
            if (obj == objF) {
                return objF;
            }
            this.L$0 = null;
            this.label = 2;
            if (interfaceC24998b.emit(obj, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$3 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/subtitle/bean/SubtitleSearchListBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$3", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {150}, m97639m = "invokeSuspend")
    static final class C197373 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C197373(Continuation<? super C197373> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C197373 c197373 = new C197373(continuation);
            c197373.L$0 = interfaceC24998b;
            return c197373.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                this.label = 1;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$a */
    static final class C19738a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ SubtitleDownloadViewModel f63024a;

        C19738a(SubtitleDownloadViewModel subtitleDownloadViewModel) {
            this.f63024a = subtitleDownloadViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(SubtitleSearchListBean subtitleSearchListBean, Continuation continuation) {
            this.f63024a.m82256o().mo14855n(subtitleSearchListBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubtitleDownloadViewModel$searchSubtitleList$1(SubtitleDownloadViewModel subtitleDownloadViewModel, DownloadBean downloadBean, C19695i c19695i, List<SubtitleLanguageMapBean> list, String str, String str2, int i11, Continuation<? super SubtitleDownloadViewModel$searchSubtitleList$1> continuation) {
        super(2, continuation);
        this.this$0 = subtitleDownloadViewModel;
        this.$downloadBean = downloadBean;
        this.$keyword = c19695i;
        this.$languageList = list;
        this.$languages = str;
        this.$nextPage = str2;
        this.$perPage = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleDownloadViewModel$searchSubtitleList$1(this.this$0, this.$downloadBean, this.$keyword, this.$languageList, this.$languages, this.$nextPage, this.$perPage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubtitleDownloadViewModel$searchSubtitleList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            final InterfaceC24995a interfaceC24995aM98799r = AbstractC25001c.m98799r(new C197361(this.this$0, this.$downloadBean, this.$keyword, this.$languageList, null));
            final SubtitleDownloadViewModel subtitleDownloadViewModel = this.this$0;
            final C19695i c19695i = this.$keyword;
            final String str = this.$languages;
            final DownloadBean downloadBean = this.$downloadBean;
            final String str2 = this.$nextPage;
            final int i12 = this.$perPage;
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(new InterfaceC24995a() { // from class: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements InterfaceC24998b {

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ InterfaceC24998b f63032a;

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ SubtitleDownloadViewModel f63033b;

                    /* JADX INFO: renamed from: c */
                    final /* synthetic */ C19695i f63034c;

                    /* JADX INFO: renamed from: d */
                    final /* synthetic */ String f63035d;

                    /* JADX INFO: renamed from: e */
                    final /* synthetic */ DownloadBean f63036e;

                    /* JADX INFO: renamed from: f */
                    final /* synthetic */ String f63037f;

                    /* JADX INFO: renamed from: g */
                    final /* synthetic */ int f63038g;

                    /* JADX INFO: renamed from: com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
                    @DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$searchSubtitleList$1$invokeSuspend$$inlined$map$1$2", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE, 50}, m97639m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC24998b interfaceC24998b, SubtitleDownloadViewModel subtitleDownloadViewModel, C19695i c19695i, String str, DownloadBean downloadBean, String str2, int i11) {
                        this.f63032a = interfaceC24998b;
                        this.f63033b = subtitleDownloadViewModel;
                        this.f63034c = c19695i;
                        this.f63035d = str;
                        this.f63036e = downloadBean;
                        this.f63037f = str2;
                        this.f63038g = i11;
                    }

                    /* JADX WARN: Code duplicated, block: B:31:0x007f A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC24998b
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        InterfaceC24998b interfaceC24998b;
                        InterfaceC24998b interfaceC24998b2;
                        Object obj2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj3 = anonymousClass1.result;
                        Object objF = IntrinsicsKt.m97630f();
                        int i12 = anonymousClass1.label;
                        if (i12 != 0) {
                            if (i12 == 1) {
                                InterfaceC24998b interfaceC24998b3 = (InterfaceC24998b) anonymousClass1.L$0;
                                ResultKt.m97107b(obj3);
                                interfaceC24998b = interfaceC24998b3;
                            } else {
                                if (i12 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m97107b(obj3);
                            }
                            return Unit.f75682a;
                        }
                        ResultKt.m97107b(obj3);
                        InterfaceC24998b interfaceC24998b4 = this.f63032a;
                        SubtitleSearchListBean subtitleSearchListBean = (SubtitleSearchListBean) obj;
                        List<SubtitleItem> items = subtitleSearchListBean != null ? subtitleSearchListBean.getItems() : null;
                        if (items == null || items.isEmpty()) {
                            obj2 = subtitleSearchListBean;
                            interfaceC24998b2 = interfaceC24998b4;
                            SubtitleDownloadViewModel subtitleDownloadViewModel = this.f63033b;
                            C19695i c19695i = this.f63034c;
                            String str = this.f63035d;
                            DownloadBean downloadBean = this.f63036e;
                            String str2 = this.f63037f;
                            int i13 = this.f63038g;
                            anonymousClass1.L$0 = interfaceC24998b4;
                            anonymousClass1.label = 1;
                            Object objM82243r = subtitleDownloadViewModel.m82243r(c19695i, str, downloadBean, str2, i13, anonymousClass1);
                            if (objM82243r == objF) {
                                return objF;
                            }
                            obj3 = objM82243r;
                            interfaceC24998b = interfaceC24998b4;
                        }
                        obj2 = subtitleSearchListBean;
                        interfaceC24998b2 = interfaceC24998b4;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                        if (interfaceC24998b2.emit(obj2, anonymousClass1) == objF) {
                            return objF;
                        }
                        return Unit.f75682a;
                        Object obj4 = obj3;
                        interfaceC24998b2 = interfaceC24998b;
                        obj2 = obj4;
                        obj2 = subtitleSearchListBean;
                        interfaceC24998b2 = interfaceC24998b4;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                        if (interfaceC24998b2.emit(obj2, anonymousClass1) == objF) {
                            return objF;
                        }
                        return Unit.f75682a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC24995a
                /* JADX INFO: renamed from: a */
                public Object mo12985a(InterfaceC24998b interfaceC24998b, Continuation continuation) {
                    Object objMo12985a = interfaceC24995aM98799r.mo12985a(new AnonymousClass2(interfaceC24998b, subtitleDownloadViewModel, c19695i, str, downloadBean, str2, i12), continuation);
                    return objMo12985a == IntrinsicsKt.m97630f() ? objMo12985a : Unit.f75682a;
                }
            }, new C197373(null));
            C19738a c19738a = new C19738a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c19738a, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
