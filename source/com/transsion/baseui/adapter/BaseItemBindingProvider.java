package com.transsion.baseui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p429g4.InterfaceC23498a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseItemBindingProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: f */
    public static final int f51006f = 8;

    /* JADX INFO: renamed from: e */
    private final int f51007e;

    @Metadata(m97099d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m97100d2 = {"Lcom/transsion/baseui/adapter/BaseItemBindingProvider$BindingViewHolder;", "Lg4/a;", "VB", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "binding", "<init>", "(Lg4/a;)V", "a", "Lg4/a;", "f", "()Lg4/a;", "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class BindingViewHolder<VB extends InterfaceC23498a> extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC23498a binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public BindingViewHolder(VB binding) {
            Intrinsics.m97802h(binding, "binding");
            View root = binding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            super(root);
            this.binding = binding;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC23498a getBinding() {
            return this.binding;
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: b */
    public void mo22757b(BaseViewHolder helper, Object obj) {
        Intrinsics.m97802h(helper, "helper");
        mo65419y(((BindingViewHolder) helper).getBinding(), helper, obj);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public final int mo22759m() {
        return this.f51007e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.m97799e(layoutInflaterFrom);
        return new BindingViewHolder(mo65420z(layoutInflaterFrom, parent));
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo65419y(InterfaceC23498a interfaceC23498a, BaseViewHolder baseViewHolder, Object obj);

    /* JADX INFO: renamed from: z */
    public abstract InterfaceC23498a mo65420z(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
