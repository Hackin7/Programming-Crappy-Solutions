.class public final Lz;
.super Landroid/view/MenuInflater;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz$b;,
        Lz$a;
    }
.end annotation


# static fields
.field static final a:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field static final b:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field final c:[Ljava/lang/Object;

.field final d:[Ljava/lang/Object;

.field e:Landroid/content/Context;

.field f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Landroid/content/Context;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lz;->a:[Ljava/lang/Class;

    sput-object v0, Lz;->b:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lz;->e:Landroid/content/Context;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lz;->c:[Ljava/lang/Object;

    iget-object p1, p0, Lz;->c:[Ljava/lang/Object;

    iput-object p1, p0, Lz;->d:[Ljava/lang/Object;

    return-void
.end method

.method static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    :goto_0
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method private a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 11

    new-instance v0, Lz$b;

    invoke-direct {v0, p0, p3}, Lz$b;-><init>(Lz;Landroid/view/Menu;)V

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result p3

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p3, v1, :cond_2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p3

    const-string v1, "menu"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p3

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expecting menu, got "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p3

    if-ne p3, v2, :cond_0

    :goto_0
    const/4 v1, 0x0

    const/4 v3, 0x0

    move v4, p3

    move-object v6, v1

    move p3, v3

    move v5, p3

    :goto_1
    if-nez p3, :cond_11

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    if-eqz v5, :cond_3

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v6, v1

    move v5, v3

    goto/16 :goto_7

    :cond_3
    const-string v7, "group"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0}, Lz$b;->a()V

    goto/16 :goto_7

    :cond_4
    const-string v7, "item"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-boolean v4, v0, Lz$b;->h:Z

    if-nez v4, :cond_10

    iget-object v4, v0, Lz$b;->A:Lge;

    if-eqz v4, :cond_5

    iget-object v4, v0, Lz$b;->A:Lge;

    invoke-virtual {v4}, Lge;->c()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v0}, Lz$b;->b()Landroid/view/SubMenu;

    goto/16 :goto_7

    :cond_5
    iput-boolean v2, v0, Lz$b;->h:Z

    iget-object v4, v0, Lz$b;->a:Landroid/view/Menu;

    iget v7, v0, Lz$b;->b:I

    iget v8, v0, Lz$b;->i:I

    iget v9, v0, Lz$b;->j:I

    iget-object v10, v0, Lz$b;->k:Ljava/lang/CharSequence;

    invoke-interface {v4, v7, v8, v9, v10}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v4

    invoke-virtual {v0, v4}, Lz$b;->a(Landroid/view/MenuItem;)V

    goto/16 :goto_7

    :cond_6
    const-string v7, "menu"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    move p3, v2

    goto/16 :goto_7

    :pswitch_1
    if-nez v5, :cond_10

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v7, "group"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object v4, v0, Lz$b;->F:Lz;

    iget-object v4, v4, Lz;->e:Landroid/content/Context;

    sget-object v7, Lb$j;->MenuGroup:[I

    invoke-virtual {v4, p2, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    sget v7, Lb$j;->MenuGroup_android_id:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lz$b;->b:I

    sget v7, Lb$j;->MenuGroup_android_menuCategory:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lz$b;->c:I

    sget v7, Lb$j;->MenuGroup_android_orderInCategory:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lz$b;->d:I

    sget v7, Lb$j;->MenuGroup_android_checkableBehavior:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lz$b;->e:I

    sget v7, Lb$j;->MenuGroup_android_visible:I

    invoke-virtual {v4, v7, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lz$b;->f:Z

    sget v7, Lb$j;->MenuGroup_android_enabled:I

    invoke-virtual {v4, v7, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lz$b;->g:Z

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_7

    :cond_7
    const-string v7, "item"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    iget-object v4, v0, Lz$b;->F:Lz;

    iget-object v4, v4, Lz;->e:Landroid/content/Context;

    sget-object v7, Lb$j;->MenuItem:[I

    invoke-virtual {v4, p2, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    sget v7, Lb$j;->MenuItem_android_id:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lz$b;->i:I

    sget v7, Lb$j;->MenuItem_android_menuCategory:I

    iget v8, v0, Lz$b;->c:I

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    sget v8, Lb$j;->MenuItem_android_orderInCategory:I

    iget v9, v0, Lz$b;->d:I

    invoke-virtual {v4, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    const/high16 v9, -0x10000

    and-int/2addr v7, v9

    const v9, 0xffff

    and-int/2addr v8, v9

    or-int/2addr v7, v8

    iput v7, v0, Lz$b;->j:I

    sget v7, Lb$j;->MenuItem_android_title:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    iput-object v7, v0, Lz$b;->k:Ljava/lang/CharSequence;

    sget v7, Lb$j;->MenuItem_android_titleCondensed:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    iput-object v7, v0, Lz$b;->l:Ljava/lang/CharSequence;

    sget v7, Lb$j;->MenuItem_android_icon:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lz$b;->m:I

    sget v7, Lb$j;->MenuItem_android_alphabeticShortcut:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lz$b;->a(Ljava/lang/String;)C

    move-result v7

    iput-char v7, v0, Lz$b;->n:C

    sget v7, Lb$j;->MenuItem_alphabeticModifiers:I

    const/16 v8, 0x1000

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lz$b;->o:I

    sget v7, Lb$j;->MenuItem_android_numericShortcut:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lz$b;->a(Ljava/lang/String;)C

    move-result v7

    iput-char v7, v0, Lz$b;->p:C

    sget v7, Lb$j;->MenuItem_numericModifiers:I

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lz$b;->q:I

    sget v7, Lb$j;->MenuItem_android_checkable:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_8

    sget v7, Lb$j;->MenuItem_android_checkable:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    goto :goto_2

    :cond_8
    iget v7, v0, Lz$b;->e:I

    :goto_2
    iput v7, v0, Lz$b;->r:I

    sget v7, Lb$j;->MenuItem_android_checked:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lz$b;->s:Z

    sget v7, Lb$j;->MenuItem_android_visible:I

    iget-boolean v8, v0, Lz$b;->f:Z

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lz$b;->t:Z

    sget v7, Lb$j;->MenuItem_android_enabled:I

    iget-boolean v8, v0, Lz$b;->g:Z

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lz$b;->u:Z

    sget v7, Lb$j;->MenuItem_showAsAction:I

    const/4 v8, -0x1

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lz$b;->v:I

    sget v7, Lb$j;->MenuItem_android_onClick:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lz$b;->z:Ljava/lang/String;

    sget v7, Lb$j;->MenuItem_actionLayout:I

    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lz$b;->w:I

    sget v7, Lb$j;->MenuItem_actionViewClass:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lz$b;->x:Ljava/lang/String;

    sget v7, Lb$j;->MenuItem_actionProviderClass:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lz$b;->y:Ljava/lang/String;

    iget-object v7, v0, Lz$b;->y:Ljava/lang/String;

    if-eqz v7, :cond_9

    move v7, v2

    goto :goto_3

    :cond_9
    move v7, v3

    :goto_3
    if-eqz v7, :cond_a

    iget v9, v0, Lz$b;->w:I

    if-nez v9, :cond_a

    iget-object v9, v0, Lz$b;->x:Ljava/lang/String;

    if-nez v9, :cond_a

    iget-object v7, v0, Lz$b;->y:Ljava/lang/String;

    sget-object v9, Lz;->b:[Ljava/lang/Class;

    iget-object v10, v0, Lz$b;->F:Lz;

    iget-object v10, v10, Lz;->d:[Ljava/lang/Object;

    invoke-virtual {v0, v7, v9, v10}, Lz$b;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lge;

    iput-object v7, v0, Lz$b;->A:Lge;

    goto :goto_4

    :cond_a
    if-eqz v7, :cond_b

    const-string v7, "SupportMenuInflater"

    const-string v9, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    invoke-static {v7, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    iput-object v1, v0, Lz$b;->A:Lge;

    :goto_4
    sget v7, Lb$j;->MenuItem_contentDescription:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    iput-object v7, v0, Lz$b;->B:Ljava/lang/CharSequence;

    sget v7, Lb$j;->MenuItem_tooltipText:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    iput-object v7, v0, Lz$b;->C:Ljava/lang/CharSequence;

    sget v7, Lb$j;->MenuItem_iconTintMode:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_c

    sget v7, Lb$j;->MenuItem_iconTintMode:I

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iget-object v8, v0, Lz$b;->E:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v7, v8}, Lcb;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v7

    iput-object v7, v0, Lz$b;->E:Landroid/graphics/PorterDuff$Mode;

    goto :goto_5

    :cond_c
    iput-object v1, v0, Lz$b;->E:Landroid/graphics/PorterDuff$Mode;

    :goto_5
    sget v7, Lb$j;->MenuItem_iconTint:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_d

    sget v7, Lb$j;->MenuItem_iconTint:I

    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    iput-object v7, v0, Lz$b;->D:Landroid/content/res/ColorStateList;

    goto :goto_6

    :cond_d
    iput-object v1, v0, Lz$b;->D:Landroid/content/res/ColorStateList;

    :goto_6
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    iput-boolean v3, v0, Lz$b;->h:Z

    goto :goto_7

    :cond_e
    const-string v7, "menu"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-virtual {v0}, Lz$b;->b()Landroid/view/SubMenu;

    move-result-object v4

    invoke-direct {p0, p1, p2, v4}, Lz;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    goto :goto_7

    :cond_f
    move v5, v2

    move-object v6, v4

    goto :goto_7

    :pswitch_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected end of document"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    :goto_7
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    goto/16 :goto_1

    :cond_11
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final inflate(ILandroid/view/Menu;)V
    .locals 2

    instance-of v0, p2, Lfs;

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lz;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lz;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception p2

    move-object v0, p1

    goto :goto_2

    :catch_0
    move-exception p2

    move-object v0, p1

    goto :goto_0

    :catch_1
    move-exception p2

    move-object v0, p1

    goto :goto_1

    :catchall_1
    move-exception p2

    goto :goto_2

    :catch_2
    move-exception p2

    :goto_0
    :try_start_2
    new-instance p1, Landroid/view/InflateException;

    const-string v1, "Error inflating menu XML"

    invoke-direct {p1, v1, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_3
    move-exception p2

    :goto_1
    new-instance p1, Landroid/view/InflateException;

    const-string v1, "Error inflating menu XML"

    invoke-direct {p1, v1, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_2
    throw p2
.end method
