.class public final Lkf;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkf$a;
    }
.end annotation


# static fields
.field private static final e:[C


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lkf;->e:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method constructor <init>(Lkf$a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lkf$a;->a:Ljava/lang/String;

    iput-object v0, p0, Lkf;->a:Ljava/lang/String;

    iget-object v0, p1, Lkf$a;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkf;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkf;->f:Ljava/lang/String;

    iget-object v0, p1, Lkf$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lkf;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkf;->g:Ljava/lang/String;

    iget-object v0, p1, Lkf$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lkf;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lkf$a;->a()I

    move-result v0

    iput v0, p0, Lkf;->c:I

    iget-object v0, p1, Lkf$a;->f:Ljava/util/List;

    invoke-static {v0, v1}, Lkf;->a(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkf;->h:Ljava/util/List;

    iget-object v0, p1, Lkf$a;->g:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lkf$a;->g:Ljava/util/List;

    const/4 v3, 0x1

    invoke-static {v0, v3}, Lkf;->a(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    iput-object v0, p0, Lkf;->d:Ljava/util/List;

    iget-object v0, p1, Lkf$a;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lkf$a;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lkf;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    :cond_1
    iput-object v2, p0, Lkf;->i:Ljava/lang/String;

    invoke-virtual {p1}, Lkf$a;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lkf;->j:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 1

    const-string v0, "http"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x50

    return p0

    :cond_0
    const-string v0, "https"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/16 p0, 0x1bb

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method static a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 15

    move-object v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p1

    :goto_0
    if-ge v3, v1, :cond_f

    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    const/16 v5, 0x2b

    const/4 v6, -0x1

    const/16 v7, 0x80

    const/16 v8, 0x7f

    const/16 v9, 0x20

    const/16 v10, 0x25

    if-lt v4, v9, :cond_3

    if-eq v4, v8, :cond_3

    if-lt v4, v7, :cond_0

    if-nez p7, :cond_3

    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v11

    if-ne v11, v6, :cond_3

    if-ne v4, v10, :cond_1

    if-eqz p4, :cond_3

    if-eqz p5, :cond_1

    invoke-static {v0, v3, v1}, Lkf;->a(Ljava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_3

    :cond_1
    if-ne v4, v5, :cond_2

    if-eqz p6, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_0

    :cond_3
    :goto_1
    new-instance v4, Lnc;

    invoke-direct {v4}, Lnc;-><init>()V

    move/from16 v11, p1

    invoke-virtual {v4, v0, v11, v3}, Lnc;->a(Ljava/lang/String;II)Lnc;

    const/4 v11, 0x0

    :goto_2
    if-ge v3, v1, :cond_e

    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v10

    if-eqz p4, :cond_5

    const/16 v6, 0x9

    if-eq v10, v6, :cond_4

    const/16 v6, 0xa

    if-eq v10, v6, :cond_4

    const/16 v6, 0xc

    if-eq v10, v6, :cond_4

    const/16 v6, 0xd

    if-eq v10, v6, :cond_4

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v5, -0x1

    goto :goto_8

    :cond_5
    :goto_4
    if-ne v10, v5, :cond_7

    if-eqz p6, :cond_7

    if-eqz p4, :cond_6

    const-string v6, "+"

    goto :goto_5

    :cond_6
    const-string v6, "%2B"

    :goto_5
    invoke-virtual {v4, v6}, Lnc;->a(Ljava/lang/String;)Lnc;

    goto :goto_3

    :cond_7
    if-lt v10, v9, :cond_a

    if-eq v10, v8, :cond_a

    if-lt v10, v7, :cond_8

    if-nez p7, :cond_a

    :cond_8
    invoke-virtual {v2, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const/4 v5, -0x1

    if-ne v6, v5, :cond_b

    const/16 v6, 0x25

    if-ne v10, v6, :cond_9

    if-eqz p4, :cond_b

    if-eqz p5, :cond_9

    invoke-static {v0, v3, v1}, Lkf;->a(Ljava/lang/String;II)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v4, v10}, Lnc;->a(I)Lnc;

    goto :goto_8

    :cond_a
    const/4 v5, -0x1

    :cond_b
    :goto_6
    if-nez v11, :cond_c

    new-instance v11, Lnc;

    invoke-direct {v11}, Lnc;-><init>()V

    :cond_c
    invoke-virtual {v11, v10}, Lnc;->a(I)Lnc;

    :goto_7
    invoke-virtual {v11}, Lnc;->d()Z

    move-result v6

    if-nez v6, :cond_d

    invoke-virtual {v11}, Lnc;->f()B

    move-result v6

    and-int/lit16 v6, v6, 0xff

    const/16 v5, 0x25

    invoke-virtual {v4, v5}, Lnc;->b(I)Lnc;

    sget-object v12, Lkf;->e:[C

    shr-int/lit8 v13, v6, 0x4

    and-int/lit8 v13, v13, 0xf

    aget-char v5, v12, v13

    invoke-virtual {v4, v5}, Lnc;->b(I)Lnc;

    sget-object v5, Lkf;->e:[C

    and-int/lit8 v6, v6, 0xf

    aget-char v5, v5, v6

    invoke-virtual {v4, v5}, Lnc;->b(I)Lnc;

    const/4 v5, -0x1

    goto :goto_7

    :cond_d
    :goto_8
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v3, v5

    const/16 v5, 0x2b

    const/4 v6, -0x1

    const/16 v10, 0x25

    goto/16 :goto_2

    :cond_e
    invoke-virtual {v4}, Lnc;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_f
    move/from16 v11, p1

    invoke-virtual/range {p0 .. p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static a(Ljava/lang/String;IIZ)Ljava/lang/String;
    .locals 8

    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_5

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2b

    const/16 v3, 0x25

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    if-eqz p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    new-instance v1, Lnc;

    invoke-direct {v1}, Lnc;-><init>()V

    invoke-virtual {v1, p0, p1, v0}, Lnc;->a(Ljava/lang/String;II)Lnc;

    :goto_2
    if-ge v0, p2, :cond_4

    invoke-virtual {p0, v0}, Ljava/lang/String;->codePointAt(I)I

    move-result p1

    if-ne p1, v3, :cond_2

    add-int/lit8 v4, v0, 0x2

    if-ge v4, p2, :cond_2

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Lkv;->a(C)I

    move-result v5

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Lkv;->a(C)I

    move-result v6

    const/4 v7, -0x1

    if-eq v5, v7, :cond_3

    if-eq v6, v7, :cond_3

    shl-int/lit8 v0, v5, 0x4

    add-int/2addr v0, v6

    invoke-virtual {v1, v0}, Lnc;->b(I)Lnc;

    move v0, v4

    goto :goto_3

    :cond_2
    if-ne p1, v2, :cond_3

    if-eqz p3, :cond_3

    const/16 v4, 0x20

    invoke-virtual {v1, v4}, Lnc;->b(I)Lnc;

    goto :goto_3

    :cond_3
    invoke-virtual {v1, p1}, Lnc;->a(I)Lnc;

    :goto_3
    invoke-static {p1}, Ljava/lang/Character;->charCount(I)I

    move-result p1

    add-int/2addr v0, p1

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lnc;->n()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v1, 0x0

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-static/range {v0 .. v7}, Lkf;->a(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Lkf;->a(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/util/List;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-static {v3, p1}, Lkf;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static a(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    const/16 v2, 0x2f

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(Ljava/lang/String;II)Z
    .locals 2

    add-int/lit8 v0, p1, 0x2

    if-ge v0, p2, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v1, 0x25

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    add-int/2addr p1, p2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Lkv;->a(C)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Lkv;->a(C)I

    move-result p0

    if-eq p0, v1, :cond_0

    return p2

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static b(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gt v1, v2, :cond_3

    const/16 v2, 0x26

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    :cond_0
    const/16 v4, 0x3d

    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-eq v4, v3, :cond_2

    if-le v4, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    :goto_2
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static b(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-lez v1, :cond_0

    const/16 v4, 0x26

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_1

    const/16 v2, 0x3d

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static d(Ljava/lang/String;)Lkf;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    new-instance v0, Lkf$a;

    invoke-direct {v0}, Lkf$a;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Lkf$a;->a(Lkf;Ljava/lang/String;)I

    move-result p0

    sget v2, Lkf$a$a;->a:I

    if-ne p0, v2, :cond_0

    invoke-virtual {v0}, Lkf$a;->b()Lkf;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final a()Ljava/net/URI;
    .locals 11

    new-instance v0, Lkf$a;

    invoke-direct {v0}, Lkf$a;-><init>()V

    iget-object v1, p0, Lkf;->a:Ljava/lang/String;

    iput-object v1, v0, Lkf$a;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lkf;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lkf;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->c:Ljava/lang/String;

    iget-object v1, p0, Lkf;->b:Ljava/lang/String;

    iput-object v1, v0, Lkf$a;->d:Ljava/lang/String;

    iget v1, p0, Lkf;->c:I

    iget-object v2, p0, Lkf;->a:Ljava/lang/String;

    invoke-static {v2}, Lkf;->a(Ljava/lang/String;)I

    move-result v2

    if-eq v1, v2, :cond_0

    iget v1, p0, Lkf;->c:I

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    iput v1, v0, Lkf$a;->e:I

    iget-object v1, v0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v0, Lkf$a;->f:Ljava/util/List;

    invoke-virtual {p0}, Lkf;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lkf;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkf$a;->a(Ljava/lang/String;)Lkf$a;

    iget-object v1, p0, Lkf;->i:Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lkf;->j:Ljava/lang/String;

    const/16 v2, 0x23

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, v0, Lkf$a;->h:Ljava/lang/String;

    iget-object v1, v0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_2

    iget-object v4, v0, Lkf$a;->f:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    iget-object v4, v0, Lkf$a;->f:Ljava/util/List;

    const-string v6, "[]"

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static/range {v5 .. v10}, Lkf;->a(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v3, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lkf$a;->g:Ljava/util/List;

    if-eqz v1, :cond_4

    iget-object v1, v0, Lkf$a;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_3
    if-ge v2, v1, :cond_4

    iget-object v3, v0, Lkf$a;->g:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_3

    iget-object v3, v0, Lkf$a;->g:Ljava/util/List;

    const-string v5, "\\^`{|}"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    invoke-static/range {v4 .. v9}, Lkf;->a(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    iget-object v1, v0, Lkf$a;->h:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v2, v0, Lkf$a;->h:Ljava/lang/String;

    const-string v3, " \"#<>\\^`{|}"

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkf;->a(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->h:Ljava/lang/String;

    :cond_5
    invoke-virtual {v0}, Lkf$a;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lkf;->a:Ljava/lang/String;

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lkf;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lkf;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Lkf;->j:Ljava/lang/String;

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, ":@"

    invoke-static {v1, v0, v2, v3}, Lkv;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lkf$a;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    new-instance v0, Lkf$a;

    invoke-direct {v0}, Lkf$a;-><init>()V

    invoke-virtual {v0, p0, p1}, Lkf$a;->a(Lkf;Ljava/lang/String;)I

    move-result p1

    sget v1, Lkf$a$a;->a:I

    if-ne p1, v1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lkf;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lkf;->j:Ljava/lang/String;

    const/16 v1, 0x3a

    iget-object v2, p0, Lkf;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lkf;->j:Ljava/lang/String;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lkf;->j:Ljava/lang/String;

    iget-object v1, p0, Lkf;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    const/16 v2, 0x2f

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    iget-object v1, p0, Lkf;->j:Ljava/lang/String;

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "?#"

    invoke-static {v1, v0, v2, v3}, Lkv;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, Lkf;

    if-eqz v0, :cond_0

    check-cast p1, Lkf;

    iget-object p1, p1, Lkf;->j:Ljava/lang/String;

    iget-object v0, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkf;->j:Ljava/lang/String;

    iget-object v1, p0, Lkf;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    const/16 v2, 0x2f

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    iget-object v1, p0, Lkf;->j:Ljava/lang/String;

    iget-object v3, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "?#"

    invoke-static {v1, v0, v3, v4}, Lkv;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    iget-object v4, p0, Lkf;->j:Ljava/lang/String;

    invoke-static {v4, v0, v1, v2}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v4

    iget-object v5, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v5, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v4

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method public final g()Ljava/lang/String;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lkf;->d:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lkf;->j:Ljava/lang/String;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lkf;->j:Ljava/lang/String;

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x23

    invoke-static {v1, v0, v2, v3}, Lkv;->a(Ljava/lang/String;IIC)I

    move-result v1

    iget-object v2, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 8

    const-string v0, "/..."

    invoke-virtual {p0, v0}, Lkf;->c(Ljava/lang/String;)Lkf$a;

    move-result-object v0

    const-string v1, ""

    const-string v2, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static/range {v1 .. v6}, Lkf;->a(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->b:Ljava/lang/String;

    const-string v2, ""

    const-string v3, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v2 .. v7}, Lkf;->a(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkf$a;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lkf$a;->b()Lkf;

    move-result-object v0

    invoke-virtual {v0}, Lkf;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lkf;->j:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkf;->j:Ljava/lang/String;

    return-object v0
.end method
