.class final Lh;
.super Lg;

# interfaces
.implements Laj$a;
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh$d;,
        Lh$c;,
        Lh$e;,
        Lh$f;,
        Lh$a;,
        Lh$g;,
        Lh$b;
    }
.end annotation


# static fields
.field private static final x:Z

.field private static final y:[I

.field private static z:Z


# instance fields
.field private A:Ljava/lang/CharSequence;

.field private B:Lbz;

.field private C:Lh$a;

.field private D:Lh$g;

.field private E:Z

.field private F:Landroid/widget/TextView;

.field private G:Landroid/view/View;

.field private H:Z

.field private I:Z

.field private J:Z

.field private K:[Lh$f;

.field private L:Lh$f;

.field private M:Z

.field private N:I

.field private O:Z

.field private P:Lh$d;

.field private final Q:Ljava/lang/Runnable;

.field private R:Z

.field private S:Landroid/graphics/Rect;

.field private T:Landroid/graphics/Rect;

.field private U:Landroidx/appcompat/app/AppCompatViewInflater;

.field final b:Landroid/content/Context;

.field final c:Landroid/view/Window;

.field final d:Landroid/view/Window$Callback;

.field final e:Landroid/view/Window$Callback;

.field final f:Lf;

.field g:Lc;

.field h:Landroid/view/MenuInflater;

.field i:Lu;

.field j:Landroidx/appcompat/widget/ActionBarContextView;

.field k:Landroid/widget/PopupWindow;

.field l:Ljava/lang/Runnable;

.field m:Lgt;

.field n:Z

.field o:Landroid/view/ViewGroup;

.field p:Z

.field q:Z

.field r:Z

.field s:Z

.field t:Z

.field u:Z

.field v:Z

.field w:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x15

    if-ge v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sput-boolean v0, Lh;->x:Z

    new-array v0, v2, [I

    const v3, 0x1010054

    aput v3, v0, v1

    sput-object v0, Lh;->y:[I

    sget-boolean v0, Lh;->x:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lh;->z:Z

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    new-instance v1, Lh$1;

    invoke-direct {v1, v0}, Lh$1;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    sput-boolean v2, Lh;->z:Z

    :cond_1
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/view/Window;Lf;)V
    .locals 2

    invoke-direct {p0}, Lg;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh;->m:Lgt;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lh;->n:Z

    const/16 v1, -0x64

    iput v1, p0, Lh;->N:I

    new-instance v1, Lh$2;

    invoke-direct {v1, p0}, Lh$2;-><init>(Lh;)V

    iput-object v1, p0, Lh;->Q:Ljava/lang/Runnable;

    iput-object p1, p0, Lh;->b:Landroid/content/Context;

    iput-object p2, p0, Lh;->c:Landroid/view/Window;

    iput-object p3, p0, Lh;->f:Lf;

    iget-object p2, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    iput-object p2, p0, Lh;->d:Landroid/view/Window$Callback;

    iget-object p2, p0, Lh;->d:Landroid/view/Window$Callback;

    instance-of p2, p2, Lh$c;

    if-eqz p2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "AppCompat has already installed itself into the Window"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p2, Lh$c;

    iget-object p3, p0, Lh;->d:Landroid/view/Window$Callback;

    invoke-direct {p2, p0, p3}, Lh$c;-><init>(Lh;Landroid/view/Window$Callback;)V

    iput-object p2, p0, Lh;->e:Landroid/view/Window$Callback;

    iget-object p2, p0, Lh;->c:Landroid/view/Window;

    iget-object p3, p0, Lh;->e:Landroid/view/Window$Callback;

    invoke-virtual {p2, p3}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    sget-object p2, Lh;->y:[I

    invoke-static {p1, v0, p2}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lcr;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcr;->b(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p3, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {p3, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    iget-object v0, p0, Lh;->U:Landroidx/appcompat/app/AppCompatViewInflater;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    sget-object v2, Lb$j;->AppCompatTheme:[I

    invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v2, Lb$j;->AppCompatTheme_viewInflaterClass:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-class v2, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/AppCompatViewInflater;

    iput-object v2, p0, Lh;->U:Landroidx/appcompat/app/AppCompatViewInflater;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    const-string v3, "AppCompatDelegate"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to instantiate custom view inflater "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Falling back to default."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    :goto_1
    iput-object v0, p0, Lh;->U:Landroidx/appcompat/app/AppCompatViewInflater;

    :cond_2
    :goto_2
    sget-boolean v0, Lh;->x:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    instance-of v0, p4, Lorg/xmlpull/v1/XmlPullParser;

    if-eqz v0, :cond_3

    move-object v0, p4

    check-cast v0, Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-le v0, v2, :cond_4

    move v0, v2

    goto :goto_3

    :cond_3
    move-object v0, p1

    check-cast v0, Landroid/view/ViewParent;

    invoke-direct {p0, v0}, Lh;->a(Landroid/view/ViewParent;)Z

    move-result v0

    goto :goto_3

    :cond_4
    move v0, v1

    :goto_3
    iget-object v3, p0, Lh;->U:Landroidx/appcompat/app/AppCompatViewInflater;

    sget-boolean v4, Lh;->x:Z

    invoke-static {}, Lcw;->a()Z

    move-result v5

    if-eqz v0, :cond_5

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_4

    :cond_5
    move-object p1, p3

    :goto_4
    sget-object v0, Lb$j;->View:[I

    invoke-virtual {p1, p4, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    if-eqz v4, :cond_6

    sget v4, Lb$j;->View_android_theme:I

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    goto :goto_5

    :cond_6
    move v4, v1

    :goto_5
    if-nez v4, :cond_7

    sget v4, Lb$j;->View_theme:I

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_7

    const-string v6, "AppCompatViewInflater"

    const-string v7, "app:theme is now deprecated. Please move to using android:theme instead."

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v4, :cond_9

    instance-of v0, p1, Lw;

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Lw;

    iget v0, v0, Lw;->a:I

    if-eq v0, v4, :cond_9

    :cond_8
    new-instance v0, Lw;

    invoke-direct {v0, p1, v4}, Lw;-><init>(Landroid/content/Context;I)V

    move-object p1, v0

    :cond_9
    if-eqz v5, :cond_a

    invoke-static {p1}, Lco;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    :cond_a
    const/4 v0, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v2, "Button"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v0, 0x2

    goto/16 :goto_6

    :sswitch_1
    const-string v2, "EditText"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v0, 0x3

    goto/16 :goto_6

    :sswitch_2
    const-string v2, "CheckBox"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v0, 0x6

    goto/16 :goto_6

    :sswitch_3
    const-string v2, "AutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v0, 0x9

    goto :goto_6

    :sswitch_4
    const-string v4, "ImageView"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    move v0, v2

    goto :goto_6

    :sswitch_5
    const-string v2, "RadioButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v0, 0x7

    goto :goto_6

    :sswitch_6
    const-string v2, "Spinner"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v0, 0x4

    goto :goto_6

    :sswitch_7
    const-string v2, "SeekBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v0, 0xc

    goto :goto_6

    :sswitch_8
    const-string v2, "ImageButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v0, 0x5

    goto :goto_6

    :sswitch_9
    const-string v2, "TextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move v0, v1

    goto :goto_6

    :sswitch_a
    const-string v2, "MultiAutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v0, 0xa

    goto :goto_6

    :sswitch_b
    const-string v2, "CheckedTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v0, 0x8

    goto :goto_6

    :sswitch_c
    const-string v2, "RatingBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v0, 0xb

    :cond_b
    :goto_6
    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_7

    :pswitch_0
    new-instance v0, Lbt;

    invoke-direct {v0, p1, p4}, Lbt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_1
    new-instance v0, Lbs;

    invoke-direct {v0, p1, p4}, Lbs;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_2
    new-instance v0, Lbo;

    invoke-direct {v0, p1, p4}, Lbo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_3
    new-instance v0, Lbc;

    invoke-direct {v0, p1, p4}, Lbc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_4
    new-instance v0, Lbg;

    invoke-direct {v0, p1, p4}, Lbg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_5
    new-instance v0, Lbr;

    invoke-direct {v0, p1, p4}, Lbr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_6
    new-instance v0, Lbf;

    invoke-direct {v0, p1, p4}, Lbf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_7
    new-instance v0, Lbl;

    invoke-direct {v0, p1, p4}, Lbl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_8
    new-instance v0, Lbv;

    invoke-direct {v0, p1, p4}, Lbv;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_9
    new-instance v0, Lbj;

    invoke-direct {v0, p1, p4}, Lbj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_a
    new-instance v0, Lbe;

    invoke-direct {v0, p1, p4}, Lbe;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_b
    new-instance v0, Lbn;

    invoke-direct {v0, p1, p4}, Lbn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_7

    :pswitch_c
    new-instance v0, Lbx;

    invoke-direct {v0, p1, p4}, Lbx;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_7
    if-nez v0, :cond_c

    if-eq p3, p1, :cond_c

    invoke-virtual {v3, p1, p2, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    :cond_c
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of p2, p1, Landroid/content/ContextWrapper;

    if-eqz p2, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0xf

    if-lt p2, p3, :cond_d

    invoke-static {v0}, Lgq;->n(Landroid/view/View;)Z

    move-result p2

    if-nez p2, :cond_d

    return-object v0

    :cond_d
    sget-object p2, Landroidx/appcompat/app/AppCompatViewInflater;->a:[I

    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_e

    new-instance p3, Landroidx/appcompat/app/AppCompatViewInflater$a;

    invoke-direct {p3, v0, p2}, Landroidx/appcompat/app/AppCompatViewInflater$a;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_f
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_c
        -0x56c015e7 -> :sswitch_b
        -0x503aa7ad -> :sswitch_a
        -0x37f7066e -> :sswitch_9
        -0x37e04bb3 -> :sswitch_8
        -0x274065a5 -> :sswitch_7
        -0x1440b607 -> :sswitch_6
        0x2e46a6ed -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lh$f;Landroid/view/KeyEvent;)V
    .locals 13

    iget-boolean v0, p1, Lh$f;->o:Z

    if-nez v0, :cond_19

    iget-boolean v0, p0, Lh;->u:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lh$f;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lh$f;->a:I

    iget-object v4, p1, Lh$f;->j:Laj;

    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1, v2}, Lh;->a(Lh$f;Z)V

    return-void

    :cond_3
    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_4

    return-void

    :cond_4
    invoke-direct {p0, p1, p2}, Lh;->b(Lh$f;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    :cond_5
    iget-object p2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    const/4 v4, -0x2

    if-eqz p2, :cond_7

    iget-boolean p2, p1, Lh$f;->q:Z

    if-eqz p2, :cond_6

    goto :goto_1

    :cond_6
    iget-object p2, p1, Lh$f;->i:Landroid/view/View;

    if-eqz p2, :cond_18

    iget-object p2, p1, Lh$f;->i:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_18

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne p2, v3, :cond_18

    move v6, v3

    goto/16 :goto_9

    :cond_7
    :goto_1
    iget-object p2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    if-nez p2, :cond_a

    invoke-virtual {p0}, Lh;->k()Landroid/content/Context;

    move-result-object p2

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {p2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    sget v6, Lb$a;->actionBarPopupTheme:I

    invoke-virtual {v5, v6, v3, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v6, v3, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_8

    iget v6, v3, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v5, v6, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_8
    sget v6, Lb$a;->panelMenuListTheme:I

    invoke-virtual {v5, v6, v3, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v6, v3, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_9

    iget v3, v3, Landroid/util/TypedValue;->resourceId:I

    :goto_2
    invoke-virtual {v5, v3, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto :goto_3

    :cond_9
    sget v3, Lb$i;->Theme_AppCompat_CompactMenu:I

    goto :goto_2

    :goto_3
    new-instance v3, Lw;

    invoke-direct {v3, p2, v1}, Lw;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    invoke-virtual {p2, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iput-object v3, p1, Lh$f;->l:Landroid/content/Context;

    sget-object p2, Lb$j;->AppCompatTheme:[I

    invoke-virtual {v3, p2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p2

    sget v3, Lb$j;->AppCompatTheme_panelBackground:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p1, Lh$f;->b:I

    sget v3, Lb$j;->AppCompatTheme_android_windowAnimationStyle:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p1, Lh$f;->f:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p2, Lh$e;

    iget-object v3, p1, Lh$f;->l:Landroid/content/Context;

    invoke-direct {p2, p0, v3}, Lh$e;-><init>(Lh;Landroid/content/Context;)V

    iput-object p2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    const/16 p2, 0x51

    iput p2, p1, Lh$f;->c:I

    iget-object p2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    if-nez p2, :cond_b

    return-void

    :cond_a
    iget-boolean p2, p1, Lh$f;->q:Z

    if-eqz p2, :cond_b

    iget-object p2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_b

    iget-object p2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_b
    iget-object p2, p1, Lh$f;->i:Landroid/view/View;

    if-eqz p2, :cond_c

    iget-object p2, p1, Lh$f;->i:Landroid/view/View;

    iput-object p2, p1, Lh$f;->h:Landroid/view/View;

    :goto_4
    move p2, v2

    goto :goto_6

    :cond_c
    iget-object p2, p1, Lh$f;->j:Laj;

    if-eqz p2, :cond_12

    iget-object p2, p0, Lh;->D:Lh$g;

    if-nez p2, :cond_d

    new-instance p2, Lh$g;

    invoke-direct {p2, p0}, Lh$g;-><init>(Lh;)V

    iput-object p2, p0, Lh;->D:Lh$g;

    :cond_d
    iget-object p2, p0, Lh;->D:Lh$g;

    iget-object v3, p1, Lh$f;->j:Laj;

    if-nez v3, :cond_e

    const/4 p2, 0x0

    goto :goto_5

    :cond_e
    iget-object v3, p1, Lh$f;->k:Lah;

    if-nez v3, :cond_f

    new-instance v3, Lah;

    iget-object v5, p1, Lh$f;->l:Landroid/content/Context;

    sget v6, Lb$g;->abc_list_menu_item_layout:I

    invoke-direct {v3, v5, v6}, Lah;-><init>(Landroid/content/Context;I)V

    iput-object v3, p1, Lh$f;->k:Lah;

    iget-object v3, p1, Lh$f;->k:Lah;

    iput-object p2, v3, Lah;->h:Laq$a;

    iget-object p2, p1, Lh$f;->j:Laj;

    iget-object v3, p1, Lh$f;->k:Lah;

    invoke-virtual {p2, v3}, Laj;->a(Laq;)V

    :cond_f
    iget-object p2, p1, Lh$f;->k:Lah;

    iget-object v3, p1, Lh$f;->g:Landroid/view/ViewGroup;

    iget-object v5, p2, Lah;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v5, :cond_11

    iget-object v5, p2, Lah;->b:Landroid/view/LayoutInflater;

    sget v6, Lb$g;->abc_expanded_menu_layout:I

    invoke-virtual {v5, v6, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object v3, p2, Lah;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v3, p2, Lah;->i:Lah$a;

    if-nez v3, :cond_10

    new-instance v3, Lah$a;

    invoke-direct {v3, p2}, Lah$a;-><init>(Lah;)V

    iput-object v3, p2, Lah;->i:Lah$a;

    :cond_10
    iget-object v3, p2, Lah;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v5, p2, Lah;->i:Lah$a;

    invoke-virtual {v3, v5}, Landroidx/appcompat/view/menu/ExpandedMenuView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v3, p2, Lah;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {v3, p2}, Landroidx/appcompat/view/menu/ExpandedMenuView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_11
    iget-object p2, p2, Lah;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    :goto_5
    check-cast p2, Landroid/view/View;

    iput-object p2, p1, Lh$f;->h:Landroid/view/View;

    iget-object p2, p1, Lh$f;->h:Landroid/view/View;

    if-eqz p2, :cond_12

    goto :goto_4

    :cond_12
    move p2, v1

    :goto_6
    if-eqz p2, :cond_19

    iget-object p2, p1, Lh$f;->h:Landroid/view/View;

    if-eqz p2, :cond_14

    iget-object p2, p1, Lh$f;->i:Landroid/view/View;

    if-eqz p2, :cond_13

    :goto_7
    move p2, v2

    goto :goto_8

    :cond_13
    iget-object p2, p1, Lh$f;->k:Lah;

    invoke-virtual {p2}, Lah;->b()Landroid/widget/ListAdapter;

    move-result-object p2

    invoke-interface {p2}, Landroid/widget/ListAdapter;->getCount()I

    move-result p2

    if-lez p2, :cond_14

    goto :goto_7

    :cond_14
    move p2, v1

    :goto_8
    if-nez p2, :cond_15

    return-void

    :cond_15
    iget-object p2, p1, Lh$f;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_16

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_16
    iget v3, p1, Lh$f;->b:I

    iget-object v5, p1, Lh$f;->g:Landroid/view/ViewGroup;

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    iget-object v3, p1, Lh$f;->h:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_17

    instance-of v5, v3, Landroid/view/ViewGroup;

    if-eqz v5, :cond_17

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v5, p1, Lh$f;->h:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_17
    iget-object v3, p1, Lh$f;->g:Landroid/view/ViewGroup;

    iget-object v5, p1, Lh$f;->h:Landroid/view/View;

    invoke-virtual {v3, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lh$f;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_18

    iget-object p2, p1, Lh$f;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_18
    move v6, v4

    :goto_9
    iput-boolean v1, p1, Lh$f;->n:Z

    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    const/4 v7, -0x2

    iget v8, p1, Lh$f;->d:I

    iget v9, p1, Lh$f;->e:I

    const/16 v10, 0x3ea

    const/high16 v11, 0x820000

    const/4 v12, -0x3

    move-object v5, p2

    invoke-direct/range {v5 .. v12}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v1, p1, Lh$f;->c:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v1, p1, Lh$f;->f:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v1, p1, Lh$f;->g:Landroid/view/ViewGroup;

    invoke-interface {v0, v1, p2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v2, p1, Lh$f;->o:Z

    :cond_19
    return-void
.end method

.method private a(Landroid/view/ViewParent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    if-eq p1, v1, :cond_3

    instance-of v2, p1, Landroid/view/View;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lgq;->m(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v0

    :cond_2
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_3
    return v0
.end method

.method private a(Lh$f;ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lh$f;->m:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p3}, Lh;->b(Lh$f;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p1, Lh$f;->j:Laj;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lh$f;->j:Laj;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Laj;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    return v1
.end method

.method private b(Lh$f;Landroid/view/KeyEvent;)Z
    .locals 10

    iget-boolean v0, p0, Lh;->u:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lh$f;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lh;->L:Lh$f;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh;->L:Lh$f;

    if-eq v0, p1, :cond_2

    iget-object v0, p0, Lh;->L:Lh$f;

    invoke-virtual {p0, v0, v1}, Lh;->a(Lh$f;Z)V

    :cond_2
    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lh$f;->a:I

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p1, Lh$f;->i:Landroid/view/View;

    :cond_3
    iget v3, p1, Lh$f;->a:I

    const/16 v4, 0x6c

    if-eqz v3, :cond_5

    iget v3, p1, Lh$f;->a:I

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    move v3, v1

    goto :goto_1

    :cond_5
    :goto_0
    move v3, v2

    :goto_1
    if-eqz v3, :cond_6

    iget-object v5, p0, Lh;->B:Lbz;

    if-eqz v5, :cond_6

    iget-object v5, p0, Lh;->B:Lbz;

    invoke-interface {v5}, Lbz;->g()V

    :cond_6
    iget-object v5, p1, Lh$f;->i:Landroid/view/View;

    if-nez v5, :cond_19

    if-eqz v3, :cond_7

    iget-object v5, p0, Lh;->g:Lc;

    instance-of v5, v5, Lk;

    if-nez v5, :cond_19

    :cond_7
    iget-object v5, p1, Lh$f;->j:Laj;

    const/4 v6, 0x0

    if-eqz v5, :cond_8

    iget-boolean v5, p1, Lh$f;->r:Z

    if-eqz v5, :cond_13

    :cond_8
    iget-object v5, p1, Lh$f;->j:Laj;

    if-nez v5, :cond_e

    iget-object v5, p0, Lh;->b:Landroid/content/Context;

    iget v7, p1, Lh$f;->a:I

    if-eqz v7, :cond_9

    iget v7, p1, Lh$f;->a:I

    if-ne v7, v4, :cond_d

    :cond_9
    iget-object v4, p0, Lh;->B:Lbz;

    if-eqz v4, :cond_d

    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    sget v8, Lb$a;->actionBarTheme:I

    invoke-virtual {v7, v8, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v8, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v8, :cond_a

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v9, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v9, Lb$a;->actionBarWidgetTheme:I

    invoke-virtual {v8, v9, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_2

    :cond_a
    sget v8, Lb$a;->actionBarWidgetTheme:I

    invoke-virtual {v7, v8, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v8, v6

    :goto_2
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v9, :cond_c

    if-nez v8, :cond_b

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_b
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v4, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_c
    if-eqz v8, :cond_d

    new-instance v4, Lw;

    invoke-direct {v4, v5, v1}, Lw;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_3

    :cond_d
    move-object v4, v5

    :goto_3
    new-instance v5, Laj;

    invoke-direct {v5, v4}, Laj;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, p0}, Laj;->a(Laj$a;)V

    invoke-virtual {p1, v5}, Lh$f;->a(Laj;)V

    iget-object v4, p1, Lh$f;->j:Laj;

    if-nez v4, :cond_e

    return v1

    :cond_e
    if-eqz v3, :cond_10

    iget-object v4, p0, Lh;->B:Lbz;

    if-eqz v4, :cond_10

    iget-object v4, p0, Lh;->C:Lh$a;

    if-nez v4, :cond_f

    new-instance v4, Lh$a;

    invoke-direct {v4, p0}, Lh$a;-><init>(Lh;)V

    iput-object v4, p0, Lh;->C:Lh$a;

    :cond_f
    iget-object v4, p0, Lh;->B:Lbz;

    iget-object v5, p1, Lh$f;->j:Laj;

    iget-object v7, p0, Lh;->C:Lh$a;

    invoke-interface {v4, v5, v7}, Lbz;->a(Landroid/view/Menu;Laq$a;)V

    :cond_10
    iget-object v4, p1, Lh$f;->j:Laj;

    invoke-virtual {v4}, Laj;->e()V

    iget v4, p1, Lh$f;->a:I

    iget-object v5, p1, Lh$f;->j:Laj;

    invoke-interface {v0, v4, v5}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_12

    invoke-virtual {p1, v6}, Lh$f;->a(Laj;)V

    if-eqz v3, :cond_11

    iget-object p1, p0, Lh;->B:Lbz;

    if-eqz p1, :cond_11

    iget-object p1, p0, Lh;->B:Lbz;

    iget-object p2, p0, Lh;->C:Lh$a;

    invoke-interface {p1, v6, p2}, Lbz;->a(Landroid/view/Menu;Laq$a;)V

    :cond_11
    return v1

    :cond_12
    iput-boolean v1, p1, Lh$f;->r:Z

    :cond_13
    iget-object v4, p1, Lh$f;->j:Laj;

    invoke-virtual {v4}, Laj;->e()V

    iget-object v4, p1, Lh$f;->s:Landroid/os/Bundle;

    if-eqz v4, :cond_14

    iget-object v4, p1, Lh$f;->j:Laj;

    iget-object v5, p1, Lh$f;->s:Landroid/os/Bundle;

    invoke-virtual {v4, v5}, Laj;->b(Landroid/os/Bundle;)V

    iput-object v6, p1, Lh$f;->s:Landroid/os/Bundle;

    :cond_14
    iget-object v4, p1, Lh$f;->i:Landroid/view/View;

    iget-object v5, p1, Lh$f;->j:Laj;

    invoke-interface {v0, v1, v4, v5}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_16

    if-eqz v3, :cond_15

    iget-object p2, p0, Lh;->B:Lbz;

    if-eqz p2, :cond_15

    iget-object p2, p0, Lh;->B:Lbz;

    iget-object v0, p0, Lh;->C:Lh$a;

    invoke-interface {p2, v6, v0}, Lbz;->a(Landroid/view/Menu;Laq$a;)V

    :cond_15
    iget-object p1, p1, Lh$f;->j:Laj;

    invoke-virtual {p1}, Laj;->f()V

    return v1

    :cond_16
    if-eqz p2, :cond_17

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_4

    :cond_17
    const/4 p2, -0x1

    :goto_4
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_18

    move p2, v2

    goto :goto_5

    :cond_18
    move p2, v1

    :goto_5
    iput-boolean p2, p1, Lh$f;->p:Z

    iget-object p2, p1, Lh$f;->j:Laj;

    iget-boolean v0, p1, Lh$f;->p:Z

    invoke-virtual {p2, v0}, Laj;->setQwertyMode(Z)V

    iget-object p2, p1, Lh$f;->j:Laj;

    invoke-virtual {p2}, Laj;->f()V

    :cond_19
    iput-boolean v2, p1, Lh$f;->m:Z

    iput-boolean v1, p1, Lh$f;->n:Z

    iput-object p1, p0, Lh;->L:Lh$f;

    return v2
.end method

.method private h(I)V
    .locals 2

    iget v0, p0, Lh;->w:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Lh;->w:I

    iget-boolean p1, p0, Lh;->v:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lh;->Q:Ljava/lang/Runnable;

    invoke-static {p1, v0}, Lgq;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Lh;->v:Z

    :cond_0
    return-void
.end method

.method private p()V
    .locals 3

    invoke-direct {p0}, Lh;->q()V

    iget-boolean v0, p0, Lh;->p:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lh;->g:Lc;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    new-instance v0, Ln;

    iget-object v1, p0, Lh;->d:Landroid/view/Window$Callback;

    check-cast v1, Landroid/app/Activity;

    iget-boolean v2, p0, Lh;->q:Z

    invoke-direct {v0, v1, v2}, Ln;-><init>(Landroid/app/Activity;Z)V

    :goto_0
    iput-object v0, p0, Lh;->g:Lc;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    new-instance v0, Ln;

    iget-object v1, p0, Lh;->d:Landroid/view/Window$Callback;

    check-cast v1, Landroid/app/Dialog;

    invoke-direct {v0, v1}, Ln;-><init>(Landroid/app/Dialog;)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lh;->g:Lc;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lh;->g:Lc;

    iget-boolean v1, p0, Lh;->R:Z

    invoke-virtual {v0, v1}, Lc;->a(Z)V

    :cond_3
    return-void
.end method

.method private q()V
    .locals 9

    iget-boolean v0, p0, Lh;->E:Z

    if-nez v0, :cond_1c

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    sget-object v1, Lb$j;->AppCompatTheme:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lb$j;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget v1, Lb$j;->AppCompatTheme_windowNoTitle:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v3, 0x6c

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v4}, Lh;->c(I)Z

    goto :goto_0

    :cond_1
    sget v1, Lb$j;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v3}, Lh;->c(I)Z

    :cond_2
    :goto_0
    sget v1, Lb$j;->AppCompatTheme_windowActionBarOverlay:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v5, 0x6d

    if-eqz v1, :cond_3

    invoke-virtual {p0, v5}, Lh;->c(I)Z

    :cond_3
    sget v1, Lb$j;->AppCompatTheme_windowActionModeOverlay:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Lh;->c(I)Z

    :cond_4
    sget v1, Lb$j;->AppCompatTheme_android_windowIsFloating:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lh;->s:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Lh;->t:Z

    const/4 v6, 0x0

    if-nez v1, :cond_a

    iget-boolean v1, p0, Lh;->s:Z

    if-eqz v1, :cond_5

    sget v1, Lb$g;->abc_dialog_title_material:I

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-boolean v2, p0, Lh;->q:Z

    iput-boolean v2, p0, Lh;->p:Z

    goto/16 :goto_4

    :cond_5
    iget-boolean v0, p0, Lh;->p:Z

    if-eqz v0, :cond_9

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v7, Lb$a;->actionBarTheme:I

    invoke-virtual {v1, v7, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_6

    new-instance v1, Lw;

    iget-object v7, p0, Lh;->b:Landroid/content/Context;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, v7, v0}, Lw;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_6
    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lb$g;->abc_screen_toolbar:I

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Lb$f;->decor_content_parent:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lbz;

    iput-object v1, p0, Lh;->B:Lbz;

    iget-object v1, p0, Lh;->B:Lbz;

    iget-object v7, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v7}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v7

    invoke-interface {v1, v7}, Lbz;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v1, p0, Lh;->q:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lh;->B:Lbz;

    invoke-interface {v1, v5}, Lbz;->a(I)V

    :cond_7
    iget-boolean v1, p0, Lh;->H:Z

    if-eqz v1, :cond_8

    iget-object v1, p0, Lh;->B:Lbz;

    const/4 v5, 0x2

    invoke-interface {v1, v5}, Lbz;->a(I)V

    :cond_8
    iget-boolean v1, p0, Lh;->I:Z

    if-eqz v1, :cond_d

    iget-object v1, p0, Lh;->B:Lbz;

    const/4 v5, 0x5

    invoke-interface {v1, v5}, Lbz;->a(I)V

    goto :goto_4

    :cond_9
    move-object v0, v6

    goto :goto_4

    :cond_a
    iget-boolean v1, p0, Lh;->r:Z

    if-eqz v1, :cond_b

    sget v1, Lb$g;->abc_screen_simple_overlay_action_mode:I

    :goto_2
    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_3

    :cond_b
    sget v1, Lb$g;->abc_screen_simple:I

    goto :goto_2

    :goto_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    if-lt v1, v5, :cond_c

    new-instance v1, Lh$3;

    invoke-direct {v1, p0}, Lh$3;-><init>(Lh;)V

    invoke-static {v0, v1}, Lgq;->a(Landroid/view/View;Lgo;)V

    goto :goto_4

    :cond_c
    move-object v1, v0

    check-cast v1, Lcd;

    new-instance v5, Lh$4;

    invoke-direct {v5, p0}, Lh$4;-><init>(Lh;)V

    invoke-interface {v1, v5}, Lcd;->setOnFitSystemWindowsListener(Lcd$a;)V

    :cond_d
    :goto_4
    if-nez v0, :cond_e

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lh;->p:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh;->q:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh;->s:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh;->r:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh;->t:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    iget-object v1, p0, Lh;->B:Lbz;

    if-nez v1, :cond_f

    sget v1, Lb$f;->title:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lh;->F:Landroid/widget/TextView;

    :cond_f
    invoke-static {v0}, Lcx;->b(Landroid/view/View;)V

    sget v1, Lb$f;->action_bar_activity_content:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v5, p0, Lh;->c:Landroid/view/Window;

    const v7, 0x1020002

    invoke-virtual {v5, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    if-eqz v5, :cond_11

    :goto_5
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    if-lez v8, :cond_10

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v1, v8}, Landroidx/appcompat/widget/ContentFrameLayout;->addView(Landroid/view/View;)V

    goto :goto_5

    :cond_10
    const/4 v8, -0x1

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->setId(I)V

    invoke-virtual {v1, v7}, Landroidx/appcompat/widget/ContentFrameLayout;->setId(I)V

    instance-of v8, v5, Landroid/widget/FrameLayout;

    if-eqz v8, :cond_11

    check-cast v5, Landroid/widget/FrameLayout;

    invoke-virtual {v5, v6}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_11
    iget-object v5, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v5, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v5, Lh$5;

    invoke-direct {v5, p0}, Lh$5;-><init>(Lh;)V

    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    iput-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_12

    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_6

    :cond_12
    iget-object v0, p0, Lh;->A:Ljava/lang/CharSequence;

    :goto_6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_15

    iget-object v1, p0, Lh;->B:Lbz;

    if-eqz v1, :cond_13

    iget-object v1, p0, Lh;->B:Lbz;

    invoke-interface {v1, v0}, Lbz;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_13
    iget-object v1, p0, Lh;->g:Lc;

    if-eqz v1, :cond_14

    iget-object v1, p0, Lh;->g:Lc;

    invoke-virtual {v1, v0}, Lc;->a(Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_14
    iget-object v1, p0, Lh;->F:Landroid/widget/TextView;

    if-eqz v1, :cond_15

    iget-object v1, p0, Lh;->F:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_15
    :goto_7
    iget-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v1, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    iget-object v8, v0, Landroidx/appcompat/widget/ContentFrameLayout;->b:Landroid/graphics/Rect;

    invoke-virtual {v8, v5, v6, v7, v1}, Landroid/graphics/Rect;->set(IIII)V

    invoke-static {v0}, Lgq;->l(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->requestLayout()V

    :cond_16
    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    sget-object v5, Lb$j;->AppCompatTheme:[I

    invoke-virtual {v1, v5}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v5, Lb$j;->AppCompatTheme_windowMinWidthMajor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v5, Lb$j;->AppCompatTheme_windowMinWidthMinor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v5, Lb$j;->AppCompatTheme_windowFixedWidthMajor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_17

    sget v5, Lb$j;->AppCompatTheme_windowFixedWidthMajor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_17
    sget v5, Lb$j;->AppCompatTheme_windowFixedWidthMinor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_18

    sget v5, Lb$j;->AppCompatTheme_windowFixedWidthMinor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_18
    sget v5, Lb$j;->AppCompatTheme_windowFixedHeightMajor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_19

    sget v5, Lb$j;->AppCompatTheme_windowFixedHeightMajor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_19
    sget v5, Lb$j;->AppCompatTheme_windowFixedHeightMinor:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_1a

    sget v5, Lb$j;->AppCompatTheme_windowFixedHeightMinor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_1a
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->requestLayout()V

    iput-boolean v4, p0, Lh;->E:Z

    invoke-virtual {p0, v2}, Lh;->e(I)Lh$f;

    move-result-object v0

    iget-boolean v1, p0, Lh;->u:Z

    if-nez v1, :cond_1c

    if-eqz v0, :cond_1b

    iget-object v0, v0, Lh$f;->j:Laj;

    if-nez v0, :cond_1c

    :cond_1b
    invoke-direct {p0, v3}, Lh;->h(I)V

    :cond_1c
    return-void
.end method

.method private r()V
    .locals 2

    iget-boolean v0, p0, Lh;->E:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private s()V
    .locals 4

    iget-object v0, p0, Lh;->P:Lh$d;

    if-nez v0, :cond_1

    new-instance v0, Lh$d;

    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    sget-object v2, Lm;->a:Lm;

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lm;

    const-string v3, "location"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/LocationManager;

    invoke-direct {v2, v1, v3}, Lm;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v2, Lm;->a:Lm;

    :cond_0
    sget-object v1, Lm;->a:Lm;

    invoke-direct {v0, p0, v1}, Lh$d;-><init>(Lh;Lm;)V

    iput-object v0, p0, Lh;->P:Lh$d;

    :cond_1
    return-void
.end method

.method private t()Z
    .locals 6

    iget-boolean v0, p0, Lh;->O:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x1

    :try_start_0
    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, p0, Lh;->b:Landroid/content/Context;

    iget-object v5, p0, Lh;->b:Landroid/content/Context;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v3, v1}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 v0, v0, 0x200

    if-nez v0, :cond_0

    return v2

    :cond_0
    return v1

    :catch_0
    move-exception v0

    const-string v1, "AppCompatDelegate"

    const-string v3, "Exception while getting ActivityInfo"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v2

    :cond_1
    return v1
.end method


# virtual methods
.method public final a(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-direct {p0}, Lh;->q()V

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lc;
    .locals 1

    invoke-direct {p0}, Lh;->p()V

    iget-object v0, p0, Lh;->g:Lc;

    return-object v0
.end method

.method final a(Landroid/view/Menu;)Lh$f;
    .locals 5

    iget-object v0, p0, Lh;->K:[Lh$f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    iget-object v4, v3, Lh$f;->j:Laj;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method final a(ILh$f;Landroid/view/Menu;)V
    .locals 1

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lh;->K:[Lh$f;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget-object p2, p0, Lh;->K:[Lh$f;

    aget-object p2, p2, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, Lh$f;->j:Laj;

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p2, Lh$f;->o:Z

    if-nez p2, :cond_2

    return-void

    :cond_2
    iget-boolean p2, p0, Lh;->u:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Lh;->d:Landroid/view/Window$Callback;

    invoke-interface {p2, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_3
    return-void
.end method

.method public final a(Laj;)V
    .locals 5

    iget-object p1, p0, Lh;->B:Lbz;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lh;->B:Lbz;

    invoke-interface {p1}, Lbz;->b()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lh;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh;->B:Lbz;

    invoke-interface {p1}, Lbz;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_0
    iget-object p1, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p1

    iget-object v2, p0, Lh;->B:Lbz;

    invoke-interface {v2}, Lbz;->c()Z

    move-result v2

    const/16 v3, 0x6c

    if-nez v2, :cond_3

    if-eqz p1, :cond_4

    iget-boolean v2, p0, Lh;->u:Z

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lh;->v:Z

    if-eqz v2, :cond_1

    iget v2, p0, Lh;->w:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lh;->Q:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lh;->Q:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    invoke-virtual {p0, v1}, Lh;->e(I)Lh$f;

    move-result-object v0

    iget-object v2, v0, Lh$f;->j:Laj;

    if-eqz v2, :cond_2

    iget-boolean v2, v0, Lh$f;->r:Z

    if-nez v2, :cond_2

    iget-object v2, v0, Lh$f;->i:Landroid/view/View;

    iget-object v4, v0, Lh$f;->j:Laj;

    invoke-interface {p1, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lh$f;->j:Laj;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Lh;->B:Lbz;

    invoke-interface {p1}, Lbz;->e()Z

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lh;->B:Lbz;

    invoke-interface {v0}, Lbz;->f()Z

    iget-boolean v0, p0, Lh;->u:Z

    if-nez v0, :cond_4

    invoke-virtual {p0, v1}, Lh;->e(I)Lh$f;

    move-result-object v0

    iget-object v0, v0, Lh$f;->j:Laj;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p0, v1}, Lh;->e(I)Lh$f;

    move-result-object p1

    iput-boolean v0, p1, Lh$f;->q:Z

    invoke-virtual {p0, p1, v1}, Lh;->a(Lh$f;Z)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lh;->a(Lh$f;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 1

    iget-boolean v0, p0, Lh;->p:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lh;->E:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lc;->a(Landroid/content/res/Configuration;)V

    :cond_0
    invoke-static {}, Lbi;->a()Lbi;

    move-result-object p1

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lbi;->a(Landroid/content/Context;)V

    invoke-virtual {p0}, Lh;->j()Z

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lh;->d:Landroid/view/Window$Callback;

    check-cast v1, Landroid/app/Activity;

    invoke-static {v1}, Les;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lh;->g:Lc;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lh;->R:Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lc;->a(Z)V

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    iget v0, p0, Lh;->N:I

    const/16 v1, -0x64

    if-ne v0, v1, :cond_2

    const-string v0, "appcompat:local_night_mode"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lh;->N:I

    :cond_2
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Lh;->q()V

    iget-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lh;->d:Landroid/view/Window$Callback;

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-direct {p0}, Lh;->q()V

    iget-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lh;->d:Landroid/view/Window$Callback;

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method final a(Lh$f;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Lh$f;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lh;->B:Lbz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh;->B:Lbz;

    invoke-interface {v0}, Lbz;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lh$f;->j:Laj;

    invoke-virtual {p0, p1}, Lh;->b(Laj;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Lh$f;->o:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    iget-object v2, p1, Lh$f;->g:Landroid/view/ViewGroup;

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Lh$f;->a:I

    invoke-virtual {p0, p2, p1, v1}, Lh;->a(ILh$f;Landroid/view/Menu;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lh$f;->m:Z

    iput-boolean p2, p1, Lh$f;->n:Z

    iput-boolean p2, p1, Lh$f;->o:Z

    iput-object v1, p1, Lh$f;->h:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lh$f;->q:Z

    iget-object p2, p0, Lh;->L:Lh$f;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Lh;->L:Lh$f;

    :cond_2
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Lh;->A:Ljava/lang/CharSequence;

    iget-object v0, p0, Lh;->B:Lbz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh;->B:Lbz;

    invoke-interface {v0, p1}, Lbz;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh;->g:Lc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh;->g:Lc;

    invoke-virtual {v0, p1}, Lc;->a(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object v0, p0, Lh;->F:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh;->F:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method final a(ILandroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lc;->a(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lh;->L:Lh$f;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh;->L:Lh$f;

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-direct {p0, p1, v0, p2}, Lh;->a(Lh$f;ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh;->L:Lh$f;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh;->L:Lh$f;

    iput-boolean v1, p1, Lh$f;->n:Z

    :cond_1
    return v1

    :cond_2
    iget-object p1, p0, Lh;->L:Lh$f;

    const/4 v0, 0x0

    if-nez p1, :cond_3

    invoke-virtual {p0, v0}, Lh;->e(I)Lh$f;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lh;->b(Lh$f;Landroid/view/KeyEvent;)Z

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-direct {p0, p1, v2, p2}, Lh;->a(Lh$f;ILandroid/view/KeyEvent;)Z

    move-result p2

    iput-boolean v0, p1, Lh$f;->m:Z

    if-eqz p2, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final a(Laj;Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lh;->u:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Laj;->l()Laj;

    move-result-object p1

    invoke-virtual {p0, p1}, Lh;->a(Landroid/view/Menu;)Lh$f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lh$f;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final a(Landroid/view/KeyEvent;)Z
    .locals 6

    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    instance-of v0, v0, Lgg$a;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    instance-of v0, v0, Li;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lgg;->a(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x52

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lh;->d:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_0
    const/4 v5, 0x4

    if-eqz v3, :cond_8

    if-eq v0, v5, :cond_6

    if-eq v0, v2, :cond_4

    return v4

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, Lh;->e(I)Lh$f;

    move-result-object v0

    iget-boolean v2, v0, Lh$f;->o:Z

    if-nez v2, :cond_5

    invoke-direct {p0, v0, p1}, Lh;->b(Lh$f;Landroid/view/KeyEvent;)Z

    :cond_5
    return v1

    :cond_6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    move v1, v4

    :goto_1
    iput-boolean v1, p0, Lh;->M:Z

    return v4

    :cond_8
    if-eq v0, v5, :cond_12

    if-eq v0, v2, :cond_9

    return v4

    :cond_9
    iget-object v0, p0, Lh;->i:Lu;

    if-nez v0, :cond_11

    invoke-virtual {p0, v4}, Lh;->e(I)Lh$f;

    move-result-object v0

    iget-object v2, p0, Lh;->B:Lbz;

    if-eqz v2, :cond_b

    iget-object v2, p0, Lh;->B:Lbz;

    invoke-interface {v2}, Lbz;->b()Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, p0, Lh;->b:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v2

    if-nez v2, :cond_b

    iget-object v2, p0, Lh;->B:Lbz;

    invoke-interface {v2}, Lbz;->c()Z

    move-result v2

    if-nez v2, :cond_a

    iget-boolean v2, p0, Lh;->u:Z

    if-nez v2, :cond_e

    invoke-direct {p0, v0, p1}, Lh;->b(Lh$f;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lh;->B:Lbz;

    invoke-interface {p1}, Lbz;->e()Z

    move-result p1

    goto :goto_4

    :cond_a
    iget-object p1, p0, Lh;->B:Lbz;

    invoke-interface {p1}, Lbz;->f()Z

    move-result p1

    goto :goto_4

    :cond_b
    iget-boolean v2, v0, Lh$f;->o:Z

    if-nez v2, :cond_f

    iget-boolean v2, v0, Lh$f;->n:Z

    if-eqz v2, :cond_c

    goto :goto_3

    :cond_c
    iget-boolean v2, v0, Lh$f;->m:Z

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lh$f;->r:Z

    if-eqz v2, :cond_d

    iput-boolean v4, v0, Lh$f;->m:Z

    invoke-direct {p0, v0, p1}, Lh;->b(Lh$f;Landroid/view/KeyEvent;)Z

    move-result v2

    goto :goto_2

    :cond_d
    move v2, v1

    :goto_2
    if-eqz v2, :cond_e

    invoke-direct {p0, v0, p1}, Lh;->a(Lh$f;Landroid/view/KeyEvent;)V

    move p1, v1

    goto :goto_4

    :cond_e
    move p1, v4

    goto :goto_4

    :cond_f
    :goto_3
    iget-boolean p1, v0, Lh$f;->o:Z

    invoke-virtual {p0, v0, v1}, Lh;->a(Lh$f;Z)V

    :goto_4
    if-eqz p1, :cond_11

    iget-object p1, p0, Lh;->b:Landroid/content/Context;

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_10

    invoke-virtual {p1, v4}, Landroid/media/AudioManager;->playSoundEffect(I)V

    return v1

    :cond_10
    const-string p1, "AppCompatDelegate"

    const-string v0, "Couldn\'t get audio manager"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_11
    return v1

    :cond_12
    iget-boolean p1, p0, Lh;->M:Z

    iput-boolean v4, p0, Lh;->M:Z

    invoke-virtual {p0, v4}, Lh;->e(I)Lh$f;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-boolean v2, v0, Lh$f;->o:Z

    if-eqz v2, :cond_14

    if-nez p1, :cond_13

    invoke-virtual {p0, v0, v1}, Lh;->a(Lh$f;Z)V

    :cond_13
    return v1

    :cond_14
    iget-object p1, p0, Lh;->i:Lu;

    if-eqz p1, :cond_15

    iget-object p1, p0, Lh;->i:Lu;

    invoke-virtual {p1}, Lu;->c()V

    :goto_5
    move p1, v1

    goto :goto_6

    :cond_15
    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object p1

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Lc;->f()Z

    move-result p1

    if-eqz p1, :cond_16

    goto :goto_5

    :cond_16
    move p1, v4

    :goto_6
    if-eqz p1, :cond_17

    return v1

    :cond_17
    return v4
.end method

.method public final b()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lh;->h:Landroid/view/MenuInflater;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lh;->p()V

    new-instance v0, Lz;

    iget-object v1, p0, Lh;->g:Lc;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lh;->g:Lc;

    invoke-virtual {v1}, Lc;->b()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Lz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lh;->h:Landroid/view/MenuInflater;

    :cond_1
    iget-object v0, p0, Lh;->h:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public final b(I)V
    .locals 2

    invoke-direct {p0}, Lh;->q()V

    iget-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Lh;->d:Landroid/view/Window$Callback;

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method final b(Laj;)V
    .locals 2

    iget-boolean v0, p0, Lh;->J:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh;->J:Z

    iget-object v0, p0, Lh;->B:Lbz;

    invoke-interface {v0}, Lbz;->h()V

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lh;->u:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lh;->J:Z

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 2

    iget v0, p0, Lh;->N:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_0

    const-string v0, "appcompat:local_night_mode"

    iget v1, p0, Lh;->N:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public final b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-direct {p0}, Lh;->q()V

    iget-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lh;->d:Landroid/view/Window$Callback;

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public final c()V
    .locals 0

    invoke-direct {p0}, Lh;->q()V

    return-void
.end method

.method public final c(I)Z
    .locals 3

    const/16 v0, 0x6c

    const/16 v1, 0x8

    if-ne p1, v1, :cond_0

    const-string p1, "AppCompatDelegate"

    const-string v1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v0

    goto :goto_0

    :cond_0
    const/16 v1, 0x9

    if-ne p1, v1, :cond_1

    const-string p1, "AppCompatDelegate"

    const-string v1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6d

    :cond_1
    :goto_0
    iget-boolean v1, p0, Lh;->t:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    if-ne p1, v0, :cond_2

    return v2

    :cond_2
    iget-boolean v0, p0, Lh;->p:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-ne p1, v1, :cond_3

    iput-boolean v2, p0, Lh;->p:Z

    :cond_3
    sparse-switch p1, :sswitch_data_0

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :sswitch_0
    invoke-direct {p0}, Lh;->r()V

    iput-boolean v1, p0, Lh;->q:Z

    return v1

    :sswitch_1
    invoke-direct {p0}, Lh;->r()V

    iput-boolean v1, p0, Lh;->p:Z

    return v1

    :sswitch_2
    invoke-direct {p0}, Lh;->r()V

    iput-boolean v1, p0, Lh;->r:Z

    return v1

    :sswitch_3
    invoke-direct {p0}, Lh;->r()V

    iput-boolean v1, p0, Lh;->I:Z

    return v1

    :sswitch_4
    invoke-direct {p0}, Lh;->r()V

    iput-boolean v1, p0, Lh;->H:Z

    return v1

    :sswitch_5
    invoke-direct {p0}, Lh;->r()V

    iput-boolean v1, p0, Lh;->t:Z

    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_5
        0x2 -> :sswitch_4
        0x5 -> :sswitch_3
        0xa -> :sswitch_2
        0x6c -> :sswitch_1
        0x6d -> :sswitch_0
    .end sparse-switch
.end method

.method public final d()V
    .locals 0

    invoke-virtual {p0}, Lh;->j()Z

    return-void
.end method

.method final d(I)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_1

    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lc;->c(Z)V

    :cond_0
    return-void

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {p0, p1}, Lh;->e(I)Lh$f;

    move-result-object p1

    iget-boolean v1, p1, Lh$f;->o:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1, v0}, Lh;->a(Lh$f;Z)V

    :cond_2
    return-void
.end method

.method protected final e(I)Lh$f;
    .locals 4

    iget-object v0, p0, Lh;->K:[Lh$f;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-gt v1, p1, :cond_2

    :cond_0
    add-int/lit8 v1, p1, 0x1

    new-array v1, v1, [Lh$f;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v1, p0, Lh;->K:[Lh$f;

    move-object v0, v1

    :cond_2
    aget-object v1, v0, p1

    if-nez v1, :cond_3

    new-instance v1, Lh$f;

    invoke-direct {v1, p1}, Lh$f;-><init>(I)V

    aput-object v1, v0, p1

    :cond_3
    return-object v1
.end method

.method public final e()V
    .locals 2

    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc;->b(Z)V

    :cond_0
    iget-object v0, p0, Lh;->P:Lh$d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh;->P:Lh$d;

    invoke-virtual {v0}, Lh$d;->a()V

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 2

    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc;->b(Z)V

    :cond_0
    return-void
.end method

.method final f(I)V
    .locals 3

    invoke-virtual {p0, p1}, Lh;->e(I)Lh$f;

    move-result-object v0

    iget-object v1, v0, Lh$f;->j:Laj;

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lh$f;->j:Laj;

    invoke-virtual {v2, v1}, Laj;->a(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/Bundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    iput-object v1, v0, Lh$f;->s:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, Lh$f;->j:Laj;

    invoke-virtual {v1}, Laj;->e()V

    iget-object v1, v0, Lh$f;->j:Laj;

    invoke-virtual {v1}, Laj;->clear()V

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Lh$f;->r:Z

    iput-boolean v1, v0, Lh$f;->q:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lh;->B:Lbz;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lh;->e(I)Lh$f;

    move-result-object v0

    if-eqz v0, :cond_3

    iput-boolean p1, v0, Lh$f;->m:Z

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Lh;->b(Lh$f;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method final g(I)I
    .locals 7

    iget-object v0, p0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v2, p0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->isShown()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_6

    iget-object v2, p0, Lh;->S:Landroid/graphics/Rect;

    if-nez v2, :cond_0

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lh;->S:Landroid/graphics/Rect;

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lh;->T:Landroid/graphics/Rect;

    :cond_0
    iget-object v2, p0, Lh;->S:Landroid/graphics/Rect;

    iget-object v4, p0, Lh;->T:Landroid/graphics/Rect;

    invoke-virtual {v2, v1, p1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v5, p0, Lh;->o:Landroid/view/ViewGroup;

    invoke-static {v5, v2, v4}, Lcx;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget v2, v4, Landroid/graphics/Rect;->top:I

    if-nez v2, :cond_1

    move v2, p1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eq v4, v2, :cond_4

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v2, p0, Lh;->G:Landroid/view/View;

    if-nez v2, :cond_2

    new-instance v2, Landroid/view/View;

    iget-object v4, p0, Lh;->b:Landroid/content/Context;

    invoke-direct {v2, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lh;->G:Landroid/view/View;

    iget-object v2, p0, Lh;->G:Landroid/view/View;

    iget-object v4, p0, Lh;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lb$c;->abc_input_method_navigation_guard:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v2, p0, Lh;->o:Landroid/view/ViewGroup;

    iget-object v4, p0, Lh;->G:Landroid/view/View;

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v4, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lh;->G:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v4, p1, :cond_3

    iput p1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v4, p0, Lh;->G:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    :goto_1
    move v2, v3

    goto :goto_2

    :cond_4
    move v2, v1

    :goto_2
    iget-object v4, p0, Lh;->G:Landroid/view/View;

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    move v3, v1

    :goto_3
    iget-boolean v4, p0, Lh;->r:Z

    if-nez v4, :cond_8

    if-eqz v3, :cond_8

    move p1, v1

    goto :goto_4

    :cond_6
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v2, :cond_7

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v2, v3

    move v3, v1

    goto :goto_4

    :cond_7
    move v2, v1

    move v3, v2

    :cond_8
    :goto_4
    if-eqz v2, :cond_a

    iget-object v2, p0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    :cond_9
    move v3, v1

    :cond_a
    :goto_5
    iget-object v0, p0, Lh;->G:Landroid/view/View;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lh;->G:Landroid/view/View;

    if-eqz v3, :cond_b

    goto :goto_6

    :cond_b
    const/16 v1, 0x8

    :goto_6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_c
    return p1
.end method

.method public final g()V
    .locals 1

    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh;->h(I)V

    return-void
.end method

.method public final h()V
    .locals 2

    iget-boolean v0, p0, Lh;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lh;->Q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh;->u:Z

    iget-object v0, p0, Lh;->g:Lc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh;->g:Lc;

    invoke-virtual {v0}, Lc;->g()V

    :cond_1
    iget-object v0, p0, Lh;->P:Lh$d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh;->P:Lh$d;

    invoke-virtual {v0}, Lh$d;->a()V

    :cond_2
    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0, p0}, Lgh;->a(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Lh;

    if-nez v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public final j()Z
    .locals 9

    iget v0, p0, Lh;->N:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_0

    iget v0, p0, Lh;->N:I

    goto :goto_0

    :cond_0
    sget v0, Lg;->a:I

    :goto_0
    const/4 v2, 0x2

    const/16 v3, 0x17

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-eq v0, v1, :cond_4

    if-eqz v0, :cond_1

    move v1, v0

    goto :goto_2

    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v3, :cond_2

    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    const-class v6, Landroid/app/UiModeManager;

    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/UiModeManager;

    invoke-virtual {v1}, Landroid/app/UiModeManager;->getNightMode()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lh;->s()V

    iget-object v1, p0, Lh;->P:Lh$d;

    iget-object v6, v1, Lh$d;->a:Lm;

    invoke-virtual {v6}, Lm;->a()Z

    move-result v6

    iput-boolean v6, v1, Lh$d;->b:Z

    iget-boolean v1, v1, Lh$d;->b:Z

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    move v1, v5

    goto :goto_2

    :cond_4
    :goto_1
    move v1, v4

    :goto_2
    const/4 v6, 0x0

    if-eq v1, v4, :cond_10

    iget-object v4, p0, Lh;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    iget v8, v7, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v8, v8, 0x30

    if-ne v1, v2, :cond_5

    const/16 v1, 0x20

    goto :goto_3

    :cond_5
    const/16 v1, 0x10

    :goto_3
    if-eq v8, v1, :cond_10

    invoke-direct {p0}, Lh;->t()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v1, p0, Lh;->b:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_d

    :cond_6
    new-instance v2, Landroid/content/res/Configuration;

    invoke-direct {v2, v7}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v7, v2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, -0x31

    or-int/2addr v1, v7

    iput v1, v2, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v4, v2, v6}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_f

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-ge v1, v2, :cond_f

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    const/4 v6, 0x0

    if-lt v1, v2, :cond_a

    sget-boolean v1, Lj;->d:Z

    if-nez v1, :cond_7

    :try_start_0
    const-class v1, Landroid/content/res/Resources;

    const-string v2, "mResourcesImpl"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lj;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v1

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve Resources#mResourcesImpl field"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_4
    sput-boolean v5, Lj;->d:Z

    :cond_7
    sget-object v1, Lj;->c:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_f

    :try_start_1
    sget-object v1, Lj;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move-exception v1

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve value from Resources#mResourcesImpl"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v1, v6

    :goto_5
    if-eqz v1, :cond_f

    sget-boolean v2, Lj;->b:Z

    if-nez v2, :cond_8

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "mDrawableCache"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lj;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    :catch_2
    move-exception v2

    const-string v3, "ResourcesFlusher"

    const-string v4, "Could not retrieve ResourcesImpl#mDrawableCache field"

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_6
    sput-boolean v5, Lj;->b:Z

    :cond_8
    sget-object v2, Lj;->a:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_9

    :try_start_3
    sget-object v2, Lj;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_7

    :catch_3
    move-exception v1

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_9
    move-object v1, v6

    :goto_7
    if-eqz v1, :cond_f

    :goto_8
    invoke-static {v1}, Lj;->a(Ljava/lang/Object;)V

    goto/16 :goto_d

    :cond_a
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v3, :cond_d

    sget-boolean v1, Lj;->b:Z

    if-nez v1, :cond_b

    :try_start_4
    const-class v1, Landroid/content/res/Resources;

    const-string v2, "mDrawableCache"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lj;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_9

    :catch_4
    move-exception v1

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve Resources#mDrawableCache field"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_9
    sput-boolean v5, Lj;->b:Z

    :cond_b
    sget-object v1, Lj;->a:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_c

    :try_start_5
    sget-object v1, Lj;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_a

    :catch_5
    move-exception v1

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve value from Resources#mDrawableCache"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_c
    move-object v1, v6

    :goto_a
    if-eqz v1, :cond_f

    goto :goto_8

    :cond_d
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_f

    sget-boolean v1, Lj;->b:Z

    if-nez v1, :cond_e

    :try_start_6
    const-class v1, Landroid/content/res/Resources;

    const-string v2, "mDrawableCache"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lj;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_b

    :catch_6
    move-exception v1

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve Resources#mDrawableCache field"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_b
    sput-boolean v5, Lj;->b:Z

    :cond_e
    sget-object v1, Lj;->a:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_f

    :try_start_7
    sget-object v1, Lj;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_c

    :catch_7
    move-exception v1

    const-string v2, "ResourcesFlusher"

    const-string v3, "Could not retrieve value from Resources#mDrawableCache"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v1, v6

    :goto_c
    if-eqz v1, :cond_f

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    :cond_f
    :goto_d
    move v6, v5

    :cond_10
    if-nez v0, :cond_13

    invoke-direct {p0}, Lh;->s()V

    iget-object v0, p0, Lh;->P:Lh$d;

    invoke-virtual {v0}, Lh$d;->a()V

    iget-object v1, v0, Lh$d;->c:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_11

    new-instance v1, Lh$d$1;

    invoke-direct {v1, v0}, Lh$d$1;-><init>(Lh$d;)V

    iput-object v1, v0, Lh$d;->c:Landroid/content/BroadcastReceiver;

    :cond_11
    iget-object v1, v0, Lh$d;->d:Landroid/content/IntentFilter;

    if-nez v1, :cond_12

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    iput-object v1, v0, Lh$d;->d:Landroid/content/IntentFilter;

    iget-object v1, v0, Lh$d;->d:Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.TIME_SET"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, v0, Lh$d;->d:Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, v0, Lh$d;->d:Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.TIME_TICK"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    :cond_12
    iget-object v1, v0, Lh$d;->e:Lh;

    iget-object v1, v1, Lh;->b:Landroid/content/Context;

    iget-object v2, v0, Lh$d;->c:Landroid/content/BroadcastReceiver;

    iget-object v0, v0, Lh$d;->d:Landroid/content/IntentFilter;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_13
    iput-boolean v5, p0, Lh;->O:Z

    return v6
.end method

.method final k()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lh;->a()Lc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc;->b()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lh;->b:Landroid/content/Context;

    :cond_1
    return-object v0
.end method

.method final l()Z
    .locals 1

    iget-boolean v0, p0, Lh;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh;->o:Landroid/view/ViewGroup;

    invoke-static {v0}, Lgq;->l(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final m()V
    .locals 1

    iget-object v0, p0, Lh;->m:Lgt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh;->m:Lgt;

    invoke-virtual {v0}, Lgt;->a()V

    :cond_0
    return-void
.end method

.method final n()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lh;->e(I)Lh$f;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lh;->a(Lh$f;Z)V

    return-void
.end method

.method final o()V
    .locals 2

    iget-object v0, p0, Lh;->B:Lbz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh;->B:Lbz;

    invoke-interface {v0}, Lbz;->h()V

    :cond_0
    iget-object v0, p0, Lh;->k:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lh;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lh;->k:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lh;->k:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lh;->k:Landroid/widget/PopupWindow;

    :cond_2
    invoke-virtual {p0}, Lh;->m()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lh;->e(I)Lh$f;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, v0, Lh$f;->j:Laj;

    if-eqz v1, :cond_3

    iget-object v0, v0, Lh$f;->j:Laj;

    invoke-virtual {v0}, Laj;->close()V

    :cond_3
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lh;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lh;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
