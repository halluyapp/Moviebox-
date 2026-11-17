package com.transsion.shorttv.base.widget.toast.core;

import android.R;
import android.app.Application;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import ls.InterfaceC25675a;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.e */
/* JADX INFO: loaded from: classes6.dex */
public class C18809e extends Toast implements InterfaceC25675a {

    /* JADX INFO: renamed from: a */
    private TextView f60809a;

    public C18809e(Application application) {
        super(application);
    }

    @Override // ls.InterfaceC25675a
    /* JADX INFO: renamed from: a */
    public boolean mo79278a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public TextView m79280b(View view) {
        if (!(view instanceof TextView)) {
            if (view.findViewById(R.id.message) instanceof TextView) {
                return (TextView) view.findViewById(R.id.message);
            }
            throw new IllegalArgumentException("You must include a TextView with an ID value of android.R.id.message");
        }
        if (view.getId() == -1) {
            view.setId(R.id.message);
        } else if (view.getId() != 16908299) {
            throw new IllegalArgumentException("You must set the ID value of TextView to android.R.id.message");
        }
        return (TextView) view;
    }

    @Override // android.widget.Toast, ls.InterfaceC25675a
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
        TextView textView = this.f60809a;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // android.widget.Toast, ls.InterfaceC25675a
    public void setView(View view) {
        super.setView(view);
        if (view == null) {
            this.f60809a = null;
        } else {
            this.f60809a = m79280b(view);
        }
    }
}
