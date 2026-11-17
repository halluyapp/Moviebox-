package com.transsion.audio.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.audio.R$drawable;
import com.transsion.audio.R$id;
import com.transsion.audio.R$string;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.moviedetailapi.DownloadItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p602mj.InterfaceC25866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.audio.adapter.SubjectListAdapter$refresh$1", m97637f = "SubjectListAdapter.kt", m97638l = {75}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class SubjectListAdapter$refresh$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DownloadItem $download;
    final /* synthetic */ BaseViewHolder $holder;
    int label;
    final /* synthetic */ SubjectListAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubjectListAdapter$refresh$1(DownloadItem downloadItem, BaseViewHolder baseViewHolder, SubjectListAdapter subjectListAdapter, Continuation<? super SubjectListAdapter$refresh$1> continuation) {
        super(2, continuation);
        this.$download = downloadItem;
        this.$holder = baseViewHolder;
        this.this$0 = subjectListAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m64445d(DownloadItem downloadItem, ImageView imageView, SubjectListAdapter subjectListAdapter, View view) {
        Integer status = downloadItem.getStatus();
        if (status != null && status.intValue() == 3) {
            imageView.setImageResource(R$drawable.play_progress_bg);
        } else {
            imageView.setImageResource(R$drawable.playing_progress_bg);
        }
        SubjectListAdapter.InterfaceC14207a optionClickListener = subjectListAdapter.getOptionClickListener();
        if (optionClickListener != null) {
            optionClickListener.mo64443a(downloadItem);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubjectListAdapter$refresh$1(this.$download, this.$holder, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubjectListAdapter$refresh$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AudioBean audioBean;
        InterfaceC25866a interfaceC25866aM64435G1;
        TextView textView;
        long jLongValue;
        long jLongValue2;
        int i11;
        ProgressBar progressBar;
        final ImageView imageView;
        Integer status;
        Long duration;
        Long readProcess;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = this.label;
        Integer numM97634d = null;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            String url = this.$download.getUrl();
            if (url == null || (interfaceC25866aM64435G1 = this.this$0.m64435G1()) == null) {
                audioBean = null;
            } else {
                this.label = 1;
                obj = interfaceC25866aM64435G1.mo101623c(url, this);
                if (obj == objF) {
                    return objF;
                }
            }
            textView = (TextView) this.$holder.getView(R$id.tv_process);
            if (audioBean != null || (readProcess = audioBean.getReadProcess()) == null) {
                jLongValue = 0;
            } else {
                jLongValue = readProcess.longValue();
            }
            if (audioBean != null || (duration = audioBean.getDuration()) == null) {
                jLongValue2 = 1;
            } else {
                jLongValue2 = duration.longValue();
            }
            i11 = (int) (((jLongValue * 1.0f) / (jLongValue2 > 0 ? jLongValue2 : 1L)) * 100);
            if (i11 >= 0 && i11 < 101) {
                textView.setText(i11 + this.this$0.getContext().getString(R$string.listened));
            }
            progressBar = (ProgressBar) this.$holder.getView(R$id.pb_subject);
            imageView = (ImageView) this.$holder.getView(R$id.iv_subject);
            imageView.setVisibility(0);
            progressBar.setVisibility(8);
            imageView.setImageResource(R$drawable.play_progress_bg);
            status = this.$download.getStatus();
            if (status == null) {
                numM97634d = status;
            } else if (audioBean != null) {
                numM97634d = Boxing.m97634d(audioBean.getStatus());
            }
            if (numM97634d != null && numM97634d.intValue() == 1) {
                textView.setText("Not open");
                progressBar.setVisibility(8);
                imageView.setVisibility(0);
            } else if (numM97634d != null && numM97634d.intValue() == 6) {
                textView.setText("Finished");
                progressBar.setVisibility(8);
                imageView.setVisibility(0);
            } else if (numM97634d == null && numM97634d.intValue() == 7) {
                textView.setText("ERROR");
                progressBar.setVisibility(8);
                imageView.setVisibility(0);
            } else {
                progressBar.setVisibility(0);
                if (numM97634d == null && numM97634d.intValue() == 3) {
                    imageView.setImageResource(R$drawable.playing_progress_bg);
                } else {
                    imageView.setImageResource(R$drawable.play_progress_bg);
                }
                progressBar.setProgress(i11);
            }
            final DownloadItem downloadItem = this.$download;
            final SubjectListAdapter subjectListAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.audio.adapter.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubjectListAdapter$refresh$1.m64445d(downloadItem, imageView, subjectListAdapter, view);
                }
            });
            return Unit.f75682a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        audioBean = (AudioBean) obj;
        textView = (TextView) this.$holder.getView(R$id.tv_process);
        if (audioBean != null) {
            jLongValue = 0;
        } else {
            jLongValue = 0;
        }
        if (audioBean != null) {
            jLongValue2 = 1;
        } else {
            jLongValue2 = 1;
        }
        i11 = (int) (((jLongValue * 1.0f) / (jLongValue2 > 0 ? jLongValue2 : 1L)) * 100);
        if (i11 >= 0) {
            textView.setText(i11 + this.this$0.getContext().getString(R$string.listened));
        }
        progressBar = (ProgressBar) this.$holder.getView(R$id.pb_subject);
        imageView = (ImageView) this.$holder.getView(R$id.iv_subject);
        imageView.setVisibility(0);
        progressBar.setVisibility(8);
        imageView.setImageResource(R$drawable.play_progress_bg);
        status = this.$download.getStatus();
        if (status == null) {
            numM97634d = status;
        } else if (audioBean != null) {
            numM97634d = Boxing.m97634d(audioBean.getStatus());
        }
        if (numM97634d != null) {
            textView.setText("Not open");
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
        } else if (numM97634d != null) {
            textView.setText("Finished");
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
        } else if (numM97634d == null) {
            progressBar.setVisibility(0);
            if (numM97634d == null) {
                imageView.setImageResource(R$drawable.play_progress_bg);
            } else {
                imageView.setImageResource(R$drawable.playing_progress_bg);
            }
            progressBar.setProgress(i11);
        } else {
            textView.setText("ERROR");
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
        }
        final DownloadItem downloadItem2 = this.$download;
        final SubjectListAdapter subjectListAdapter2 = this.this$0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.audio.adapter.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubjectListAdapter$refresh$1.m64445d(downloadItem2, imageView, subjectListAdapter2, view);
            }
        });
        return Unit.f75682a;
    }
}
