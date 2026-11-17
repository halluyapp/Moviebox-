package com.transsion.moviedetailapi;

import android.app.Application;
import android.os.Bundle;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Link;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.p1002enum.PostListSource;
import com.transsion.moviedetailapi.p1002enum.ProfileSubSource;
import com.transsion.web.api.WebConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p653on.InterfaceC26367a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSubjectListViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: j */
    public static final C16211a f54992j = new C16211a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f54993b;

    /* JADX INFO: renamed from: c */
    private final Lazy f54994c;

    /* JADX INFO: renamed from: d */
    private final Lazy f54995d;

    /* JADX INFO: renamed from: e */
    private final Lazy f54996e;

    /* JADX INFO: renamed from: f */
    private final Lazy f54997f;

    /* JADX INFO: renamed from: g */
    private final Lazy f54998g;

    /* JADX INFO: renamed from: h */
    private String f54999h;

    /* JADX INFO: renamed from: i */
    private PostRankType f55000i;

    /* JADX INFO: renamed from: com.transsion.moviedetailapi.AbsSubjectListViewModel$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C16211a {
        private C16211a() {
        }

        public /* synthetic */ C16211a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsSubjectListViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f54993b = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.moviedetailapi.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsSubjectListViewModel.m70934L();
            }
        });
        this.f54994c = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetailapi.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsSubjectListViewModel.m70933G();
            }
        });
        this.f54995d = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetailapi.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsSubjectListViewModel.m70942j();
            }
        });
        this.f54996e = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetailapi.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsSubjectListViewModel.m70943k();
            }
        });
        this.f54997f = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetailapi.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsSubjectListViewModel.m70932D();
            }
        });
        this.f54998g = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetailapi.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsSubjectListViewModel.m70944l();
            }
        });
        this.f54999h = "";
        this.f55000i = PostRankType.POST_RANK_TYPE_DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C3187b0 m70932D() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C3187b0 m70933G() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final InterfaceC26367a m70934L() {
        return (InterfaceC26367a) C22982c.f70163e.m91553a().m91552h(InterfaceC26367a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C3187b0 m70942j() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C3187b0 m70943k() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C3187b0 m70944l() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC26367a m70945z() {
        return (InterfaceC26367a) this.f54993b.getValue();
    }

    /* JADX INFO: renamed from: A */
    public abstract PostListSource mo69056A();

    /* JADX INFO: renamed from: B */
    public ProfileSubSource mo70864B() {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public void m70946C(String str, int i11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new AbsSubjectListViewModel$like$1(str, i11, this, null), 3, null);
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo69057E(boolean z11);

    /* JADX INFO: renamed from: F */
    public abstract void mo69058F(Bundle bundle);

    /* JADX INFO: renamed from: H */
    public void m70947H(PostSubjectItem postSubjectItem, int i11) {
        String subjectId;
        String value;
        String groupId;
        String subjectId2;
        String url;
        String userId;
        Intrinsics.m97802h(postSubjectItem, "postSubjectItem");
        HashMap map = new HashMap();
        Subject subject = postSubjectItem.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        map.put("subject_id", subjectId);
        Subject subject2 = postSubjectItem.getSubject();
        map.put("has_resource", String.valueOf(subject2 != null ? subject2.getHasResource() : null));
        String postId = postSubjectItem.getPostId();
        if (postId == null) {
            postId = "";
        }
        map.put("post_id", postId);
        Media media = postSubjectItem.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value);
        Group group = postSubjectItem.getGroup();
        if (group == null || (groupId = group.getGroupId()) == null) {
            groupId = "";
        }
        map.put("group_id", groupId);
        Subject subject3 = postSubjectItem.getSubject();
        if (subject3 == null || (subjectId2 = subject3.getSubjectId()) == null) {
            subjectId2 = "";
        }
        map.put("subject_id", subjectId2);
        String content = postSubjectItem.getContent();
        if (content == null) {
            content = "";
        }
        map.put("link_url", content);
        Link link = postSubjectItem.getLink();
        if (link == null || (url = link.getUrl()) == null) {
            url = "";
        }
        map.put("link_url", url);
        User user = postSubjectItem.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        map.put("avatar_user_id", userId);
        map.put("sequence", String.valueOf(i11));
        String ops = postSubjectItem.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        map.put(WebConstants.PAGE_FROM, this.f54999h);
        Map mapM70957q = m70957q(this.f55000i.ordinal());
        if (mapM70957q != null) {
            for (Map.Entry entry : mapM70957q.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                map.put(str, str2);
            }
        }
        C14450a.f50860a.m65142e(mo69065w(this.f55000i.ordinal()), map);
    }

    /* JADX INFO: renamed from: I */
    public void m70948I(PostSubjectItem postSubjectItem, int i11, String subPageName) {
        String subjectId;
        String value;
        String groupId;
        String subjectId2;
        String url;
        String userId;
        Intrinsics.m97802h(postSubjectItem, "postSubjectItem");
        Intrinsics.m97802h(subPageName, "subPageName");
        HashMap map = new HashMap();
        Subject subject = postSubjectItem.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        map.put("subject_id", subjectId);
        Subject subject2 = postSubjectItem.getSubject();
        map.put("has_resource", String.valueOf(subject2 != null ? subject2.getHasResource() : null));
        String postId = postSubjectItem.getPostId();
        if (postId == null) {
            postId = "";
        }
        map.put("post_id", postId);
        Media media = postSubjectItem.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value);
        Group group = postSubjectItem.getGroup();
        if (group == null || (groupId = group.getGroupId()) == null) {
            groupId = "";
        }
        map.put("group_id", groupId);
        Subject subject3 = postSubjectItem.getSubject();
        if (subject3 == null || (subjectId2 = subject3.getSubjectId()) == null) {
            subjectId2 = "";
        }
        map.put("subject_id", subjectId2);
        String title = postSubjectItem.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        Link link = postSubjectItem.getLink();
        if (link == null || (url = link.getUrl()) == null) {
            url = "";
        }
        map.put("link_url", url);
        User user = postSubjectItem.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        map.put("avatar_user_id", userId);
        map.put("sequence", String.valueOf(i11));
        String ops = postSubjectItem.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        map.put(WebConstants.PAGE_FROM, this.f54999h);
        map.put("module_name", WebConstants.FIELD_ITEM);
        map.put("subpage_name", subPageName);
        Map mapM70957q = m70957q(this.f55000i.ordinal());
        if (mapM70957q != null) {
            for (Map.Entry entry : mapM70957q.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                map.put(str, str2);
            }
        }
        C14450a.f50860a.m65143f(mo69065w(this.f55000i.ordinal()), map);
    }

    /* JADX INFO: renamed from: J */
    public void m70949J(PostSubjectItem postSubjectItem, int i11, String moduleName, String subPageName) {
        Intrinsics.m97802h(postSubjectItem, "postSubjectItem");
        Intrinsics.m97802h(moduleName, "moduleName");
        Intrinsics.m97802h(subPageName, "subPageName");
        Link link = postSubjectItem.getLink();
        m70950K(postSubjectItem, i11, moduleName, link != null ? link.getUrl() : null, subPageName);
    }

    /* JADX INFO: renamed from: K */
    public void m70950K(PostSubjectItem postSubjectItem, int i11, String moduleName, String str, String str2) {
        String subjectId;
        String value;
        String value2;
        String groupId;
        String userId;
        Intrinsics.m97802h(postSubjectItem, "postSubjectItem");
        Intrinsics.m97802h(moduleName, "moduleName");
        HashMap map = new HashMap();
        map.put("module_name", moduleName);
        if (str2 == null) {
            str2 = "";
        }
        map.put("subpage_name", str2);
        Subject subject = postSubjectItem.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        map.put("subject_id", subjectId);
        Subject subject2 = postSubjectItem.getSubject();
        map.put("has_resource", String.valueOf(subject2 != null ? subject2.getHasResource() : null));
        String postId = postSubjectItem.getPostId();
        if (postId == null) {
            postId = "";
        }
        map.put("post_id", postId);
        Media media = postSubjectItem.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value);
        String itemType = postSubjectItem.getItemType();
        if (itemType == null) {
            itemType = PostItemType.SUBJECT.getValue();
        }
        map.put("item_type", itemType);
        Media media2 = postSubjectItem.getMedia();
        if (media2 == null || (value2 = media2.getMediaType()) == null) {
            value2 = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value2);
        Group group = postSubjectItem.getGroup();
        if (group == null || (groupId = group.getGroupId()) == null) {
            groupId = "";
        }
        map.put("group_id", groupId);
        String title = postSubjectItem.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        if (str == null) {
            str = "";
        }
        map.put("link_url", str);
        String ops = postSubjectItem.getOps();
        if (ops == null) {
            ops = "";
        }
        map.put("ops", ops);
        map.put(WebConstants.PAGE_FROM, this.f54999h);
        User user = postSubjectItem.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        map.put("avatar_user_id", userId);
        map.put("sequence", String.valueOf(i11));
        Map mapM70961u = m70961u(this.f55000i.ordinal());
        if (mapM70961u != null) {
            for (Map.Entry entry : mapM70961u.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (str4 == null) {
                    str4 = "";
                }
                map.put(str3, str4);
            }
        }
        C14450a.f50860a.m65144g(mo69065w(this.f55000i.ordinal()), map);
    }

    /* JADX INFO: renamed from: M */
    public final void m70951M(PostRankType postRankType) {
        Intrinsics.m97802h(postRankType, "<set-?>");
        this.f55000i = postRankType;
    }

    /* JADX INFO: renamed from: N */
    public final void m70952N(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f54999h = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m70953m(String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new AbsSubjectListViewModel$deletePost$1(str, this, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final LiveData m70954n() {
        return m70955o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: o */
    public final C3187b0 m70955o() {
        return (C3187b0) this.f54995d.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final C3187b0 m70956p() {
        return (C3187b0) this.f54998g.getValue();
    }

    /* JADX INFO: renamed from: q */
    public Map m70957q(int i11) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final LiveData m70958r() {
        return m70959s();
    }

    /* JADX INFO: renamed from: s */
    protected final C3187b0 m70959s() {
        return (C3187b0) this.f54997f.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final PostRankType m70960t() {
        return this.f55000i;
    }

    /* JADX INFO: renamed from: u */
    public Map m70961u(int i11) {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final String m70962v() {
        return this.f54999h;
    }

    /* JADX INFO: renamed from: w */
    public String mo69065w(int i11) {
        return "";
    }

    /* JADX INFO: renamed from: x */
    public final LiveData m70963x() {
        return m70964y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: y */
    public final C3187b0 m70964y() {
        return (C3187b0) this.f54994c.getValue();
    }
}
