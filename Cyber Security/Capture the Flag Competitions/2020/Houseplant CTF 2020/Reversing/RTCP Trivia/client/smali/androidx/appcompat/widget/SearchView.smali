.class public Landroidx/appcompat/widget/SearchView;
.super Lcf;

# interfaces
.implements Lv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/SearchView$a;,
        Landroidx/appcompat/widget/SearchView$SearchAutoComplete;,
        Landroidx/appcompat/widget/SearchView$f;,
        Landroidx/appcompat/widget/SearchView$e;,
        Landroidx/appcompat/widget/SearchView$d;,
        Landroidx/appcompat/widget/SearchView$b;,
        Landroidx/appcompat/widget/SearchView$c;
    }
.end annotation


# static fields
.field static final p:Landroidx/appcompat/widget/SearchView$a;


# instance fields
.field private final A:I

.field private final B:I

.field private final C:Ljava/lang/CharSequence;

.field private D:Landroidx/appcompat/widget/SearchView$c;

.field private E:Landroidx/appcompat/widget/SearchView$b;

.field private F:Landroid/view/View$OnClickListener;

.field private G:Z

.field private H:Z

.field private I:Ljava/lang/CharSequence;

.field private J:Z

.field private K:Z

.field private L:I

.field private M:Z

.field private N:Ljava/lang/CharSequence;

.field private O:Ljava/lang/CharSequence;

.field private P:Z

.field private Q:I

.field private final R:Ljava/lang/Runnable;

.field private S:Ljava/lang/Runnable;

.field private final T:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field private final U:Landroid/view/View$OnClickListener;

.field private final V:Landroid/widget/TextView$OnEditorActionListener;

.field private final W:Landroid/widget/AdapterView$OnItemClickListener;

.field final a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

.field private final aa:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private ab:Landroid/text/TextWatcher;

.field final b:Landroid/view/View;

.field final c:Landroid/widget/ImageView;

.field final d:Landroid/widget/ImageView;

.field final e:Landroid/widget/ImageView;

.field final f:Landroid/widget/ImageView;

.field final g:Landroid/view/View;

.field final h:Landroid/content/Intent;

.field final i:Landroid/content/Intent;

.field j:Landroid/view/View$OnFocusChangeListener;

.field k:Landroidx/appcompat/widget/SearchView$d;

.field l:Z

.field m:Lhj;

.field n:Landroid/app/SearchableInfo;

.field o:Landroid/os/Bundle;

.field q:Landroid/view/View$OnKeyListener;

.field private final r:Landroid/view/View;

.field private final s:Landroid/view/View;

.field private t:Landroidx/appcompat/widget/SearchView$f;

.field private u:Landroid/graphics/Rect;

.field private v:Landroid/graphics/Rect;

.field private w:[I

.field private x:[I

.field private final y:Landroid/widget/ImageView;

.field private final z:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/appcompat/widget/SearchView$a;

    invoke-direct {v0}, Landroidx/appcompat/widget/SearchView$a;-><init>()V

    sput-object v0, Landroidx/appcompat/widget/SearchView;->p:Landroidx/appcompat/widget/SearchView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lb$a;->searchViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Lcf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->u:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->v:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/appcompat/widget/SearchView;->w:[I

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->x:[I

    new-instance v0, Landroidx/appcompat/widget/SearchView$1;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$1;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->R:Ljava/lang/Runnable;

    new-instance v0, Landroidx/appcompat/widget/SearchView$3;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$3;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->S:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->T:Ljava/util/WeakHashMap;

    new-instance v0, Landroidx/appcompat/widget/SearchView$6;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$6;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->U:Landroid/view/View$OnClickListener;

    new-instance v0, Landroidx/appcompat/widget/SearchView$7;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$7;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->q:Landroid/view/View$OnKeyListener;

    new-instance v0, Landroidx/appcompat/widget/SearchView$8;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$8;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->V:Landroid/widget/TextView$OnEditorActionListener;

    new-instance v0, Landroidx/appcompat/widget/SearchView$9;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$9;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->W:Landroid/widget/AdapterView$OnItemClickListener;

    new-instance v0, Landroidx/appcompat/widget/SearchView$10;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$10;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->aa:Landroid/widget/AdapterView$OnItemSelectedListener;

    new-instance v0, Landroidx/appcompat/widget/SearchView$2;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$2;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->ab:Landroid/text/TextWatcher;

    sget-object v0, Lb$j;->SearchView:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcr;

    move-result-object p2

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p3, Lb$j;->SearchView_layout:I

    sget v0, Lb$g;->abc_search_view:I

    invoke-virtual {p2, p3, v0}, Lcr;->g(II)I

    move-result p3

    const/4 v0, 0x1

    invoke-virtual {p1, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p1, Lb$f;->search_src_text:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSearchView(Landroidx/appcompat/widget/SearchView;)V

    sget p1, Lb$f;->search_edit_frame:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->r:Landroid/view/View;

    sget p1, Lb$f;->search_plate:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->b:Landroid/view/View;

    sget p1, Lb$f;->submit_area:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->s:Landroid/view/View;

    sget p1, Lb$f;->search_button:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->c:Landroid/widget/ImageView;

    sget p1, Lb$f;->search_go_btn:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->d:Landroid/widget/ImageView;

    sget p1, Lb$f;->search_close_btn:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->e:Landroid/widget/ImageView;

    sget p1, Lb$f;->search_voice_btn:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->f:Landroid/widget/ImageView;

    sget p1, Lb$f;->search_mag_icon:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->y:Landroid/widget/ImageView;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->b:Landroid/view/View;

    sget p3, Lb$j;->SearchView_queryBackground:I

    invoke-virtual {p2, p3}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-static {p1, p3}, Lgq;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->s:Landroid/view/View;

    sget p3, Lb$j;->SearchView_submitBackground:I

    invoke-virtual {p2, p3}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-static {p1, p3}, Lgq;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->c:Landroid/widget/ImageView;

    sget p3, Lb$j;->SearchView_searchIcon:I

    invoke-virtual {p2, p3}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->d:Landroid/widget/ImageView;

    sget p3, Lb$j;->SearchView_goIcon:I

    invoke-virtual {p2, p3}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->e:Landroid/widget/ImageView;

    sget p3, Lb$j;->SearchView_closeIcon:I

    invoke-virtual {p2, p3}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->f:Landroid/widget/ImageView;

    sget p3, Lb$j;->SearchView_voiceIcon:I

    invoke-virtual {p2, p3}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->y:Landroid/widget/ImageView;

    sget p3, Lb$j;->SearchView_searchIcon:I

    invoke-virtual {p2, p3}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget p1, Lb$j;->SearchView_searchHintIcon:I

    invoke-virtual {p2, p1}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->z:Landroid/graphics/drawable/Drawable;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->c:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v2, Lb$h;->abc_searchview_description_search:I

    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lct;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    sget p1, Lb$j;->SearchView_suggestionRowLayout:I

    sget p3, Lb$g;->abc_search_dropdown_item_icons_2line:I

    invoke-virtual {p2, p1, p3}, Lcr;->g(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/SearchView;->A:I

    sget p1, Lb$j;->SearchView_commitIcon:I

    invoke-virtual {p2, p1, v1}, Lcr;->g(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/SearchView;->B:I

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->c:Landroid/widget/ImageView;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->U:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->e:Landroid/widget/ImageView;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->U:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->d:Landroid/widget/ImageView;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->U:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->f:Landroid/widget/ImageView;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->U:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->U:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->ab:Landroid/text/TextWatcher;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->V:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->W:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->aa:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->q:Landroid/view/View$OnKeyListener;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    new-instance p3, Landroidx/appcompat/widget/SearchView$4;

    invoke-direct {p3, p0}, Landroidx/appcompat/widget/SearchView$4;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    sget p1, Lb$j;->SearchView_iconifiedByDefault:I

    invoke-virtual {p2, p1, v0}, Lcr;->a(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    sget p1, Lb$j;->SearchView_android_maxWidth:I

    const/4 p3, -0x1

    invoke-virtual {p2, p1, p3}, Lcr;->e(II)I

    move-result p1

    if-eq p1, p3, :cond_0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    :cond_0
    sget p1, Lb$j;->SearchView_defaultQueryHint:I

    invoke-virtual {p2, p1}, Lcr;->c(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->C:Ljava/lang/CharSequence;

    sget p1, Lb$j;->SearchView_queryHint:I

    invoke-virtual {p2, p1}, Lcr;->c(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->I:Ljava/lang/CharSequence;

    sget p1, Lb$j;->SearchView_android_imeOptions:I

    invoke-virtual {p2, p1, p3}, Lcr;->a(II)I

    move-result p1

    if-eq p1, p3, :cond_1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setImeOptions(I)V

    :cond_1
    sget p1, Lb$j;->SearchView_android_inputType:I

    invoke-virtual {p2, p1, p3}, Lcr;->a(II)I

    move-result p1

    if-eq p1, p3, :cond_2

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    :cond_2
    sget p1, Lb$j;->SearchView_android_focusable:I

    invoke-virtual {p2, p1, v0}, Lcr;->a(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setFocusable(Z)V

    iget-object p1, p2, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.speech.action.WEB_SEARCH"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->h:Landroid/content/Intent;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->h:Landroid/content/Intent;

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->h:Landroid/content/Intent;

    const-string p3, "android.speech.extra.LANGUAGE_MODEL"

    const-string v0, "web_search"

    invoke-virtual {p1, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance p1, Landroid/content/Intent;

    const-string p3, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {p1, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->i:Landroid/content/Intent;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->i:Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getDropDownAnchor()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->g:Landroid/view/View;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->g:Landroid/view/View;

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->g:Landroid/view/View;

    new-instance p2, Landroidx/appcompat/widget/SearchView$5;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/SearchView$5;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_3
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->l:Z

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->n()V

    return-void
.end method

.method private a(Landroid/database/Cursor;)Landroid/content/Intent;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "suggest_intent_action"

    invoke-static {p1, v1}, Lcm;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    const-string v1, "android.intent.action.SEARCH"

    :cond_1
    const-string v2, "suggest_intent_data"

    invoke-static {p1, v2}, Lcm;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_3

    const-string v3, "suggest_intent_data_id"

    invoke-static {p1, v3}, Lcm;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    if-nez v2, :cond_4

    move-object v2, v0

    goto :goto_0

    :cond_4
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    :goto_0
    const-string v3, "suggest_intent_query"

    invoke-static {p1, v3}, Lcm;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "suggest_intent_extra_data"

    invoke-static {p1, v4}, Lcm;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v1, v2, v4, v3}, Landroidx/appcompat/widget/SearchView;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I

    move-result p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 p1, -0x1

    :goto_1
    const-string v2, "SearchView"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Search suggestions cursor at row "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " returned exception."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method

.method private a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 p1, 0x10000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    :cond_0
    const-string p1, "user_query"

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->O:Ljava/lang/CharSequence;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    if-eqz p4, :cond_1

    const-string p1, "query"

    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    if-eqz p3, :cond_2

    const-string p1, "intent_extra_data_key"

    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->o:Landroid/os/Bundle;

    if-eqz p1, :cond_3

    const-string p1, "app_data"

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->o:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    return-object v0
.end method

.method private a(Z)V
    .locals 6

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    iget-object v5, p0, Landroidx/appcompat/widget/SearchView;->c:Landroid/widget/ImageView;

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0, v3}, Landroidx/appcompat/widget/SearchView;->b(Z)V

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->r:Landroid/view/View;

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->y:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->l:Z

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :cond_3
    :goto_2
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->y:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->l()V

    if-nez v3, :cond_4

    move v1, v4

    :cond_4
    invoke-direct {p0, v1}, Landroidx/appcompat/widget/SearchView;->c(Z)V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->k()V

    return-void
.end method

.method static a(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private b(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->H:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->M:Z

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private c(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->M:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private getPreferredHeight()I
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lb$d;->abc_search_view_preferred_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private getPreferredWidth()I
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lb$d;->abc_search_view_preferred_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private j()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->H:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->M:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private k()V
    .locals 2

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->s:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private l()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->l:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->P:Z

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    :goto_0
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->e:Landroid/widget/ImageView;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->e:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/appcompat/widget/SearchView;->ENABLED_STATE_SET:[I

    goto :goto_2

    :cond_3
    sget-object v0, Landroidx/appcompat/widget/SearchView;->EMPTY_STATE_SET:[I

    :goto_2
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_4
    return-void
.end method

.method private m()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->R:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private n()V
    .locals 7

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getQueryHint()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView;->l:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->z:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getTextSize()F

    move-result v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v2, v4

    double-to-int v2, v2

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->z:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    new-instance v2, Landroid/text/SpannableStringBuilder;

    const-string v3, "   "

    invoke-direct {v2, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Landroid/text/style/ImageSpan;

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->z:Landroid/graphics/drawable/Drawable;

    invoke-direct {v3, v4}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/16 v6, 0x21

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-object v0, v2

    :cond_2
    :goto_0
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->P:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->P:Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getImeOptions()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/SearchView;->Q:I

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget v1, p0, Landroidx/appcompat/widget/SearchView;->Q:I

    const/high16 v2, 0x2000000

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    return-void
.end method

.method final a(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->O:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->b(Z)V

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, v1}, Landroidx/appcompat/widget/SearchView;->c(Z)V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->l()V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->k()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->D:Landroidx/appcompat/widget/SearchView$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->N:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->N:Ljava/lang/CharSequence;

    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "android.intent.action.SEARCH"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v1, p1}, Landroidx/appcompat/widget/SearchView;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method final a(ILandroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result p2

    if-eqz p2, :cond_7

    const/16 p2, 0x42

    if-eq p1, p2, :cond_6

    const/16 p2, 0x54

    if-eq p1, p2, :cond_6

    const/16 p2, 0x3d

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    const/16 p2, 0x15

    if-eq p1, p2, :cond_4

    const/16 v0, 0x16

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    const/16 p2, 0x13

    if-ne p1, p2, :cond_7

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getListSelection()I

    move-result p1

    if-nez p1, :cond_7

    return v1

    :cond_4
    :goto_0
    if-ne p1, p2, :cond_5

    move p1, v1

    goto :goto_1

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->length()I

    move-result p1

    :goto_1
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setListSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->clearListSelection()V

    sget-object p1, Landroidx/appcompat/widget/SearchView;->p:Landroidx/appcompat/widget/SearchView$a;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SearchView$a;->a(Landroid/widget/AutoCompleteTextView;)V

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getListSelection()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->b(I)Z

    move-result p1

    return p1

    :cond_7
    return v1
.end method

.method public final b()V
    .locals 3

    const-string v0, ""

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->O:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget v1, p0, Landroidx/appcompat/widget/SearchView;->Q:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->P:Z

    return-void
.end method

.method final b(I)Z
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->k:Landroidx/appcompat/widget/SearchView$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->k:Landroidx/appcompat/widget/SearchView$d;

    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    invoke-virtual {v0}, Lhj;->a()Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->a(Landroid/database/Cursor;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v2, "SearchView"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed launch activity: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->dismissDropDown()V

    const/4 p1, 0x1

    return p1
.end method

.method public clearFocus()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->K:Z

    invoke-super {p0}, Lcf;->clearFocus()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->clearFocus()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->K:Z

    return-void
.end method

.method final d()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/appcompat/widget/SearchView;->FOCUSED_STATE_SET:[I

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/appcompat/widget/SearchView;->EMPTY_STATE_SET:[I

    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_1
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->s:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->invalidate()V

    return-void
.end method

.method final e()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->D:Landroidx/appcompat/widget/SearchView$c;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->D:Landroidx/appcompat/widget/SearchView$c;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    invoke-interface {v1}, Landroidx/appcompat/widget/SearchView$c;->a()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->dismissDropDown()V

    :cond_2
    return-void
.end method

.method final f()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->l:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$b;

    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$b;->a()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    invoke-direct {p0, v1}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    :cond_2
    return-void
.end method

.method final g()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->F:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->F:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public getImeOptions()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getImeOptions()I

    move-result v0

    return v0
.end method

.method public getInputType()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getInputType()I

    move-result v0

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->L:I

    return v0
.end method

.method public getQuery()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getQueryHint()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->I:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->I:Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->C:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getSuggestionCommitIconResId()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->B:I

    return v0
.end method

.method public getSuggestionRowLayout()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->A:I

    return v0
.end method

.method public getSuggestionsAdapter()Lhj;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    return-object v0
.end method

.method final h()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->m()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->i()V

    :cond_0
    return-void
.end method

.method final i()V
    .locals 4

    sget-object v0, Landroidx/appcompat/widget/SearchView;->p:Landroidx/appcompat/widget/SearchView$a;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v2, v0, Landroidx/appcompat/widget/SearchView$a;->a:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    :try_start_0
    iget-object v0, v0, Landroidx/appcompat/widget/SearchView$a;->a:Ljava/lang/reflect/Method;

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    sget-object v0, Landroidx/appcompat/widget/SearchView;->p:Landroidx/appcompat/widget/SearchView$a;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v2, v0, Landroidx/appcompat/widget/SearchView$a;->b:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    :try_start_1
    iget-object v0, v0, Landroidx/appcompat/widget/SearchView$a;->b:Ljava/lang/reflect/Method;

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->R:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->S:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    invoke-super {p0}, Lcf;->onDetachedFromWindow()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    invoke-super/range {p0 .. p5}, Lcf;->onLayout(ZIIII)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->u:Landroid/graphics/Rect;

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->w:[I

    invoke-virtual {p1, p4}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->x:[I

    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/SearchView;->getLocationInWindow([I)V

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->w:[I

    const/4 v0, 0x1

    aget p4, p4, v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->x:[I

    aget v0, v1, v0

    sub-int/2addr p4, v0

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->w:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->x:[I

    aget v2, v2, v1

    sub-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr p1, p4

    invoke-virtual {p2, v0, p4, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->v:Landroid/graphics/Rect;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->u:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->left:I

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->u:Landroid/graphics/Rect;

    iget p4, p4, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    invoke-virtual {p1, p2, v1, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->t:Landroidx/appcompat/widget/SearchView$f;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/appcompat/widget/SearchView$f;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->v:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->u:Landroid/graphics/Rect;

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-direct {p1, p2, p3, p4}, Landroidx/appcompat/widget/SearchView$f;-><init>(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->t:Landroidx/appcompat/widget/SearchView$f;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->t:Landroidx/appcompat/widget/SearchView$f;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->t:Landroidx/appcompat/widget/SearchView$f;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->v:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->u:Landroid/graphics/Rect;

    invoke-virtual {p1, p2, p3}, Landroidx/appcompat/widget/SearchView$f;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Lcf;->onMeasure(II)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_4

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    goto :goto_2

    :cond_1
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->L:I

    if-lez v0, :cond_6

    goto :goto_0

    :cond_2
    iget p1, p0, Landroidx/appcompat/widget/SearchView;->L:I

    if-lez p1, :cond_3

    iget p1, p0, Landroidx/appcompat/widget/SearchView;->L:I

    goto :goto_2

    :cond_3
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    move-result p1

    goto :goto_2

    :cond_4
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->L:I

    if-lez v0, :cond_5

    :goto_0
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->L:I

    :goto_1
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_2

    :cond_5
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    move-result v0

    goto :goto_1

    :cond_6
    :goto_2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    if-eq v0, v1, :cond_8

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    move-result p2

    goto :goto_3

    :cond_8
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :goto_3
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Lcf;->onMeasure(II)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroidx/appcompat/widget/SearchView$e;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcf;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Landroidx/appcompat/widget/SearchView$e;

    iget-object v0, p1, Lhm;->d:Landroid/os/Parcelable;

    invoke-super {p0, v0}, Lcf;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Landroidx/appcompat/widget/SearchView$e;->a:Z

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->requestLayout()V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Lcf;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Landroidx/appcompat/widget/SearchView$e;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/SearchView$e;-><init>(Landroid/os/Parcelable;)V

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    iput-boolean v0, v1, Landroidx/appcompat/widget/SearchView$e;->a:Z

    return-object v1
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcf;->onWindowFocusChanged(Z)V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->m()V

    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->K:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->isFocusable()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0, v1}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    :cond_2
    return p1

    :cond_3
    invoke-super {p0, p1, p2}, Lcf;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public setAppSearchData(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->o:Landroid/os/Bundle;

    return-void
.end method

.method public setIconified(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->f()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->g()V

    return-void
.end method

.method public setIconifiedByDefault(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->l:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->l:Z

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->n()V

    return-void
.end method

.method public setImeOptions(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    return-void
.end method

.method public setInputType(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/widget/SearchView;->L:I

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->requestLayout()V

    return-void
.end method

.method public setOnCloseListener(Landroidx/appcompat/widget/SearchView$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->E:Landroidx/appcompat/widget/SearchView$b;

    return-void
.end method

.method public setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->j:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->D:Landroidx/appcompat/widget/SearchView$c;

    return-void
.end method

.method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->F:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnSuggestionListener(Landroidx/appcompat/widget/SearchView$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->k:Landroidx/appcompat/widget/SearchView$d;

    return-void
.end method

.method public setQuery(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    return-void
.end method

.method public setQueryHint(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->I:Ljava/lang/CharSequence;

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->n()V

    return-void
.end method

.method public setQueryRefinementEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->J:Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    instance-of v0, v0, Lcm;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    check-cast v0, Lcm;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput p1, v0, Lcm;->a:I

    :cond_1
    return-void
.end method

.method public setSearchableInfo(Landroid/app/SearchableInfo;)V
    .locals 6

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    const/4 v0, 0x0

    const/high16 v1, 0x10000

    const/4 v2, 0x1

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    move-result v3

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setThreshold(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getImeOptions()I

    move-result v3

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getInputType()I

    move-result p1

    and-int/lit8 v3, p1, 0xf

    if-ne v3, v2, :cond_0

    const v3, -0x10001

    and-int/2addr p1, v3

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    or-int/2addr p1, v1

    const/high16 v3, 0x80000

    or-int/2addr p1, v3

    :cond_0
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    invoke-virtual {p1, v0}, Lhj;->a(Landroid/database/Cursor;)V

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance p1, Lcm;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    iget-object v5, p0, Landroidx/appcompat/widget/SearchView;->T:Ljava/util/WeakHashMap;

    invoke-direct {p1, v3, p0, v4, v5}, Lcm;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    check-cast p1, Lcm;

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->J:Z

    if-eqz v3, :cond_2

    const/4 v3, 0x2

    goto :goto_0

    :cond_2
    move v3, v2

    :goto_0
    iput v3, p1, Lcm;->a:I

    :cond_3
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->n()V

    :cond_4
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    const/4 v3, 0x0

    if-eqz p1, :cond_7

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->h:Landroid/content/Intent;

    goto :goto_1

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->n:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->i:Landroid/content/Intent;

    :cond_6
    :goto_1
    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_7

    move v3, v2

    :cond_7
    iput-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->M:Z

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->M:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v0, "nm"

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setPrivateImeOptions(Ljava/lang/String;)V

    :cond_8
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    return-void
.end method

.method public setSubmitButtonEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->H:Z

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->G:Z

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->a(Z)V

    return-void
.end method

.method public setSuggestionsAdapter(Lhj;)V
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->a:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->m:Lhj;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method
