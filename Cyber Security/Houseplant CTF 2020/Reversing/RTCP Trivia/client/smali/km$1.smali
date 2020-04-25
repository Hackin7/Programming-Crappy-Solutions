.class public final Lkm$1;
.super Lkm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkh;

.field final synthetic b:I

.field final synthetic c:[B

.field final synthetic d:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lkm$1;->a:Lkh;

    iput p1, p0, Lkm$1;->b:I

    iput-object p2, p0, Lkm$1;->c:[B

    const/4 p1, 0x0

    iput p1, p0, Lkm$1;->d:I

    invoke-direct {p0}, Lkm;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkh;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lkm$1;->a:Lkh;

    return-object v0
.end method

.method public final a(Lnd;)V
    .locals 3

    iget-object v0, p0, Lkm$1;->c:[B

    iget v1, p0, Lkm$1;->d:I

    iget v2, p0, Lkm$1;->b:I

    invoke-interface {p1, v0, v1, v2}, Lnd;->c([BII)Lnd;

    return-void
.end method

.method public final b()J
    .locals 2

    iget v0, p0, Lkm$1;->b:I

    int-to-long v0, v0

    return-wide v0
.end method
