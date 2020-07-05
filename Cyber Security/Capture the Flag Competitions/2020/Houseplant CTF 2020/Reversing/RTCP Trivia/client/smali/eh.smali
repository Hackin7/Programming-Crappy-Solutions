.class public final Leh;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leh$a;
    }
.end annotation


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Leh$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldy;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Leh;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ldy;->j()I

    move-result v0

    iput v0, p0, Leh;->a:I

    invoke-virtual {p1}, Ldy;->k()I

    move-result v0

    iput v0, p0, Leh;->b:I

    invoke-virtual {p1}, Ldy;->l()I

    move-result v0

    iput v0, p0, Leh;->c:I

    invoke-virtual {p1}, Ldy;->m()I

    move-result v0

    iput v0, p0, Leh;->d:I

    invoke-virtual {p1}, Ldy;->u()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldx;

    iget-object v3, p0, Leh;->e:Ljava/util/ArrayList;

    new-instance v4, Leh$a;

    invoke-direct {v4, v2}, Leh$a;-><init>(Ldx;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ldy;)V
    .locals 11

    iget v0, p0, Leh;->a:I

    invoke-virtual {p1, v0}, Ldy;->b(I)V

    iget v0, p0, Leh;->b:I

    invoke-virtual {p1, v0}, Ldy;->c(I)V

    iget v0, p0, Leh;->c:I

    invoke-virtual {p1, v0}, Ldy;->d(I)V

    iget v0, p0, Leh;->d:I

    invoke-virtual {p1, v0}, Ldy;->e(I)V

    iget-object v0, p0, Leh;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Leh;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leh$a;

    iget-object v3, v2, Leh$a;->a:Ldx;

    iget-object v3, v3, Ldx;->c:Ldx$c;

    invoke-virtual {p1, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v4

    iget-object v5, v2, Leh$a;->b:Ldx;

    iget v6, v2, Leh$a;->c:I

    iget v8, v2, Leh$a;->d:I

    iget v9, v2, Leh$a;->e:I

    const/4 v7, -0x1

    const/4 v10, 0x0

    invoke-virtual/range {v4 .. v10}, Ldx;->a(Ldx;IIIIZ)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
