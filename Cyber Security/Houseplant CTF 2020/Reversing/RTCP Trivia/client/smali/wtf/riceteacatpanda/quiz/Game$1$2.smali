.class final Lwtf/riceteacatpanda/quiz/Game$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwtf/riceteacatpanda/quiz/Game$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lwtf/riceteacatpanda/quiz/Game$1;


# direct methods
.method constructor <init>(Lwtf/riceteacatpanda/quiz/Game$1;I)V
    .locals 0

    iput-object p1, p0, Lwtf/riceteacatpanda/quiz/Game$1$2;->b:Lwtf/riceteacatpanda/quiz/Game$1;

    iput p2, p0, Lwtf/riceteacatpanda/quiz/Game$1$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Lnw;->a()Lkr;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{\"method\":\"answer\",\"answer\":"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lwtf/riceteacatpanda/quiz/Game$1$2;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lkr;->a(Ljava/lang/String;)Z

    return-void
.end method
